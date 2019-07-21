package com.designpattern.proxy;

public class Service1 implements Service{

	@Override
	public void doSomething(String user) {	
		System.out.println("I am doing real cool stuff for "+user);
		
	}

	@Override
	public void doSomethingElse(String user) {
		System.out.println("I am doing real awesome stuff for "+user);	
	}
	
	

}
