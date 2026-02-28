package com.coforge.Day4Prj;
import java.util.Scanner;
public class DemoOnArrays {
public static void main(String[] args) {
	int arr[]=new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter elements: ");
	for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
	System.out.println("Array elements");
	int sum=0;
	for(int i=0;i<arr.length;i++)
		sum+=arr[i];
		System.out.println("Sum is: "+sum);
}
}
