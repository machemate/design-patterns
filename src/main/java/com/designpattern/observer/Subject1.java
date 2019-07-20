package com.designpattern.observer;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Subject1 implements Publisher {
	/*
	 * to avaoid ConcurrentModicationException use Java 8'S
	 * ConcurrentHashMap.newKeySet() which can be considered as equivalent to
	 * Concurrent HashSet.
	 */
	private static Set<Subscriber> subscribers=ConcurrentHashMap.newKeySet();

	@Override
	public boolean registerSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
		return true;
	}

	@Override
	public boolean unRegisterSubscriber(Subscriber subscriber) {
		if(subscribers.remove(subscriber)) {
			System.out.println("Subscriber Removed");
		};
		return true;
	}

	@Override
	public void notifyThem(Message msg) {
		subscribers.forEach(e->e.update(msg));		
	}
	

	
}
