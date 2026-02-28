package com.coforge;

public class DemoFinal {
private final String name="ABC";
public void printDetails() {
	System.out.println(this.name);
}
public static void main(String[] args) {
	DemoFinal dof=new DemoFinal();
	dof.printDetails();
}
}
