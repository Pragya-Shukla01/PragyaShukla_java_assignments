package com.coforge.CarsManagementApp;

public class GasCar extends Car implements AddOns {
	@Override
	public void engineType() {
		System.out.println("Engine type is Gas type ");
		
	}
	@Override
	public void audioSystem() {
		System.out.println("Audio system is with 8 speakers, 2 woofers added");
	}
	public GasCar(String model) {
		super(model);
	}
}
