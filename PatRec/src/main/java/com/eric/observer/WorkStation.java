package com.eric.observer;

public class WorkStation {
	
	public static void main(String args[]){
		
		WeatherData wd = new WeatherData();
		
		CurrentConditionsDisplay display = new CurrentConditionsDisplay(wd);
		
		wd.setMeasurements(11F, 21F, 31F);
		
		wd.setMeasurements(12F, 22F, 32F);
		
		
		
	}

}
