package com.xworkz.earcphones.event;

public class EventCreator {

	public static void main(String[] args) {
		System.out.println("created EventCreator no-arg");
	}
	
	//exception event
	// abnormal situation
	//stop execution of program
	public void createExceptionalEvent()
	{
		//No exception of type Integer can be thrown; an exception type must be a subclass of throwable;
		RuntimeException runtimeException = new RuntimeException();
		throw runtimeException;
	}

}
