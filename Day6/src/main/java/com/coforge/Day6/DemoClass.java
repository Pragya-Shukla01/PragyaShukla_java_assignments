package com.coforge.Day6;

public class DemoClass {
    public static void calculate() {
    	int a=5,b=0;
    	if(b==0)
    		throw new ArithmeticException();
    	else
    		System.out.println(a/b);
    }
    public static void checkAge(int age) throws AgeNotSufficientException {
    	if(age>15)
    		System.out.println("Eligible to register plus two");
    	else
    		throw new AgeNotSufficientException("age ");
    }
	public static void main(String[] args) throws AgeNotSufficientException {
		try {
			calculate();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		   
			checkAge(17);	
		
		
		
		System.out.println("application completed");
		

	}

}
