package com.designpattern.immutablewithbuilder;


/**
 * Immutable User Class.For Address class we are using Builder Design Pattern
 * 
 * @author manoj
 *
 */
public class User {

	final String name;
	private final Address add;
	
	public User(String name,Address add) {
		this.name=name;
		this.add=new Address.AddressBuilder().street(add.getStreet()).landmark(add.getLandMark()).build();
	}
	
	public String getName() {
		return this.name;
	}
	
	public Address getAdd() {
		Address ad=new Address();
		ad.setStreet(add.getStreet());
		return ad;
	}
	
}
