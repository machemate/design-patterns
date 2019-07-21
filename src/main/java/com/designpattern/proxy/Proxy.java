package com.designpattern.proxy;

public class Proxy implements Service {

	private Service service;


	@Override
	public void doSomething(String user) {
		// checking if user is admin: this is use of proxy
		if (user.equalsIgnoreCase("Manoj")) {
			service=new Service1();
			System.out.println("Allowed acess to admin "+user);
			service.doSomething(user);
		} else {
			System.out.println(user+" You are not admin here: Try with admin access");
		}

	}
	
	boolean avalableInCache=false;
	@Override
	public void doSomethingElse(String user) {		
		// checking if user data is in cache: this is use of proxy
		if (avalableInCache) {
			System.out.println("Got data from cache for "+user);
		} else {
			service=new Service1();
			service.doSomethingElse(user);
			avalableInCache=true;
		}
	}

}
