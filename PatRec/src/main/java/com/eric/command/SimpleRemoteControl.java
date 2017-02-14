package com.eric.command;

public class SimpleRemoteControl {
	private Command slot;
	
	public SimpleRemoteControl(){}

	public Command getSlot() {
		return slot;
	}

	public void setSlot(Command slot) {
		this.slot = slot;
	}
	
	public void buttonWasPressed(){
		this.getSlot().execute();
	}

}
