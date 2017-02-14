package com.eric.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Observable o;
	
	private float temp;
	
	private float humid;
	
	public CurrentConditionsDisplay(Observable o){
		this.o = o;
		o.addObserver(this);  // !!!!
	}

	public void update(Observable o, Object arg) {
		if( o instanceof WeatherData){
			WeatherData wd = (WeatherData) o;
			this.temp = wd.getTemp();
			this.humid = wd.getHumid();
			display();
		}

	}

	public void display() {
		System.out.println("Current condition -- Temp: " + this.getTemp() +" Humid: " + this.humid);
		
	}

	public Observable getO() {
		return o;
	}

	public void setO(Observable o) {
		this.o = o;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumid() {
		return humid;
	}

	public void setHumid(float humid) {
		this.humid = humid;
	}
	
	

}
