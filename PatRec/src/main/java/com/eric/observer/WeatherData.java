package com.eric.observer;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temp;
	
	private float humid;
	
	private float pressure;
	
	public WeatherData(){
		
	}
	
	public void measurementChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humid, float pressure){
		this.temp = temp;
		this.humid = humid;
		this.pressure = pressure;
		measurementChanged();
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




	public float getPressure() {
		return pressure;
	}




	public void setPressure(float pressure) {
		this.pressure = pressure;
	}




	public static void main(String args[]){
		System.out.println("TEst");
	}
	
	

}
