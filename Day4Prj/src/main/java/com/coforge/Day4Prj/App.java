package com.coforge.Day4Prj;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MyInterface mi= new DemoClass();
        mi.display();
        mi.printDetails();
        mi= new Hello();
        mi.display();
        mi.printDetails();
        MyInterface.useParking("Coforge ");
  }
}
