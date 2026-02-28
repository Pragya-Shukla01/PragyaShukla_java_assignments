package com.coforge;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculator c = new Calculator();
       System.out.println(c.add(5,6));
       System.out.println(c.sub(76,34));
       System.out.println(c.mul(5,6));
       c.div(5,2);
       c.power(5,3);
       c.squareRoot(144);
       c.logValue(2);
	}

}
