package com.designpattern.observer;

public class Observer2 implements Subscriber{

	@Override
	public void update(Message msg) {
			System.out.println("I am observer 2 and I Received msg: "+msg.getMessage());
		
	}

	
	
}
