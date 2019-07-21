package com.designpattern.proxy;

public class Client {

	public static void main(String[] args) {

		Proxy p=new Proxy();
		p.doSomething("Danny");
		p.doSomething("Manoj");
		p.doSomethingElse("John");
	}
}
