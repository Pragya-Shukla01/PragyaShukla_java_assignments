package com.coforge.Day5Prj;
import java.util.Enumeration;
import java.util.Vector;
public class DemoOnVectors {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		System.out.println(vector.capacity());
		vector.ensureCapacity(45);
		vector.add(23);
		vector.add(244);
		vector.add(56);
		vector.add(25);
		vector.add(22);
		vector.add(21);
		vector.add(67);
		vector.add(27);
		vector.add(78);
		vector.add(29);
		vector.add(90);
		System.out.println(vector.capacity());
//		Enumeration<Integer> enums= vector.elements();
//		while(enums.hasMoreElements())
//			System.out.println(enums.nextElement());
		vector.trimToSize();
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		vector.add(98);
		System.out.println(vector.capacity());
		
	}

}
