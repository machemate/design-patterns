package com.designpattern.observer;
/**
 * It should be immutable so that it doesn't change and received same by all subscribers
 * @author Manoj Chemate
 *
 */
public final class Message {

	private final String message;
	
	public Message(String msg) {
		message=msg;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}
