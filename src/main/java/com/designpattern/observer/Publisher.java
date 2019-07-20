package com.designpattern.observer;
/**
 * Object who can change it's state and notify subscriber
 * @author Manoj Chemate
 *
 */
public interface Publisher {

	boolean registerSubscriber(Subscriber subscriber);
	boolean unRegisterSubscriber(Subscriber subscriber);
	void notifyThem(Message msg);
}
