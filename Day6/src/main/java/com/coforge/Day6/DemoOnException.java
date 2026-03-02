package com.coforge.Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoOnException {
public static void readFile() throws FileNotFoundException{
	FileReader reader = new FileReader("data.txt");
}
	
	
public static void main(String[] args)  {
//	int a =5,b[]= {1,2,3,0,5};
//	try {
//		for(int i=0;i<=b.length;i++)
//		System.out.println(a/b[i]);	
//	}
//	catch(ArithmeticException e){
//		System.out.println("Arithmetic Exception occured");
////		e.printStackTrace();
////		System.out.println(e.getMessage());
//		
//	}
//	catch(ArrayIndexOutOfBoundsException ae) {
//		System.out.println("Exception occured");
//		
//	}
//	catch(RuntimeException re) {
//		re.getMessage();
//	}
//	catch(Exception e) {
//		e.printStackTrace();
//	}
//	String s=null;
//	try {
//		System.out.println(s.charAt(3));
//	}
//	catch(NullPointerException ne) {
//		ne.printStackTrace();
//	}
//	finally {
//		System.out.println("application completed");	
//	}
//	FileReader reader=null;
//	try {
//		 reader= new FileReader("data.txt");
//		int ch;
//		while((ch=reader.read())!=1)
//			System.out.println((char)ch);
//	}
//	catch(FileNotFoundException ex) {
//		ex.printStackTrace();
//	}
//	catch(IOException ex) {
//		ex.printStackTrace();
//	}
//	finally {
////		try {
////		if(reader!=null)
////		reader.close();
////		
////	}
////		catch(IOException ex) {
////			System.out.println("Exception occured");
////		}
//		System.out.println("finally executed");
//}
	
}

}
