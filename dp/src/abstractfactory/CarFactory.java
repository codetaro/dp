//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : dp
//  @ File Name : CarFactory.java
//  @ Date : 15/08/2017
//  @ Author : 
//
//
package abstractfactory;


class CarFactory extends Factory {

	@Override
	public Engine getEngine() {
		return new CarEngine();
	}

	@Override
	public Tyre getTyre() {
		return new CarTyre();
	}

}
