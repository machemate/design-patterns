package com.designpattern.observer;

public class Client {

	public static void main(String[] args) {
		
		Publisher pub1=new Subject1();
		Publisher pub2=new Subject2();
		
		Subscriber sub1=new Observer1();
		Subscriber sub2=new Observer2();
		
		pub1.registerSubscriber(sub1);
		pub1.registerSubscriber(sub2);
		pub2.registerSubscriber(sub1);
		
		int i=100;
		
		while(i>0) {
		//just to check there is no ConcurrentModificationException.	
		if(i==70 || i==30) {
			new Thread(
					()->{
						pub1.unRegisterSubscriber(sub2);
						pub1.unRegisterSubscriber(sub1);
						pub1.registerSubscriber(sub1);
						pub1.registerSubscriber(sub2);
						pub2.registerSubscriber(sub2);
					}
					
					).start();
		}	
		pub1.notifyThem(new Message(" from publisher 1"));
		pub2.notifyThem(new Message("from publisher 2"));
		i--;
		}
		
	}
	
	
}
