package com.eric.command;

public class RemoteControlTest {

	
	public static void main(String[] args){
		
		Light light = new Light();
		LightOnCommand loc = new LightOnCommand(light);
		SimpleRemoteControl ctl = new SimpleRemoteControl();
		ctl.setSlot(loc);
		ctl.buttonWasPressed();
		
		
		
		
		
		
	}
}
