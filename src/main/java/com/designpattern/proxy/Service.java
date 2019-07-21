package com.designpattern.proxy;
/**
 * It must be implemented by Real Service Object and Proxy because client will deal with interface..
 * @author manoj
 *
 */
public interface Service {

	void doSomething(String user);
	void doSomethingElse(String user);
}
