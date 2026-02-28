package com.coforge.Day4Prj;
import java.util.Scanner;
public class LinearSearch {
public static void main(String[] args) {
	int arr[]= {11,2,3,48,5};
	Scanner sc = new Scanner(System.in);
	int key=sc.nextInt();
	int i=0;
	for( i=0;i<arr.length;i++) {
		if(arr[i]==key) 
	 	System.out.println("element found");
		  break;
	}
	if(i==arr.length)
		System.out.println("not found");

}

}


