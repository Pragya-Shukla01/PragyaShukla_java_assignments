package com.coforge.CarsManagementApp;

public class CarsMain {
public static void main(String[] args) {
	PetrolCar pcar = new PetrolCar("Swift");
	pcar.engineType();
	pcar.audioSystem();
	pcar.showModel();
	pcar.roofOpen();
	pcar.showWarrantyPolicy();
	DieselCar dcar = new DieselCar("Nexon");
	dcar.engineType();
	dcar.audioSystem();
	dcar.showModel();
	dcar.roofOpen();
	dcar.showWarrantyPolicy();
	GasCar gcar = new GasCar("i20");
	gcar.engineType();
	gcar.audioSystem();
	gcar.showModel();
	gcar.roofOpen();
	gcar.showWarrantyPolicy();
	
}
}
