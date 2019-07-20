package com.designpattern.observer;

public class Observer1 implements Subscriber{

	@Override
	public void update(Message msg) {
			System.out.println("I am observer 1 and I Received msg: "+msg.getMessage());
		
	}

	
	
}
