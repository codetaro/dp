//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : dp
//  @ File Name : TruckFactory.java
//  @ Date : 15/08/2017
//  @ Author : 
//
//
package abstractfactory;


class TruckFactory extends Factory {

	TruckFactory() {}
	
	@Override
	public Engine getEngine() {
		return new TruckEngine();
	}
	
	@Override
	public Tyre getTyre() {
		return new TruckTyre();
	}
}
