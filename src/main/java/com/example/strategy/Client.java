package com.example.strategy;
/**
 * Client can select any one of the strategy ay runtime.
 * @author manoj
 *
 */
public class Client {

	public static void main(String[] args) {
		Selector s=new Selector();
		s.selectStrategy(new Service3());
		s.runStrategy();
	}

}
