package com.designpattern.strategy;

/**
 * This is called as context object in GoF Book. Client will use it to select Strategy
 * @author manoj
 *
 */
public class Selector {

	private Service service;
	
	public void selectStrategy(Service service) {
		this.service=service;
	}
	
	public void runStrategy() {
		this.service.runStrategy();
	}
	
}
