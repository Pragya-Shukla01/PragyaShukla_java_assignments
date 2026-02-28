package com.coforge.CarsManagementApp;

public interface AddOns {
public default void audioSystem() {
	System.out.println("Audio system with default 2 speakers");
}
public default void roofOpen() {
	System.out.println("by default roof open disabled");
}
public static void warrantyPolicy() {
	System.out.println("Warranty period : 3 years");
}
}
