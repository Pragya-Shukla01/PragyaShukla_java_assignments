package com.coforge.Day6;
import java.util.*;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	static HashSet<Employee> empSet=new HashSet<>();
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
		while(true) {
			System.out.println("\n-----------Employee Menu--------------");
			System.out.println("1. Insert Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Single Employee details");
			System.out.println("6. Exit");
			System.out.println("enter choice:  ");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				insertEmployee();
				break;
			case 2:
				displayAll();
				break;
			case 3:
				updateEmployee();
				break;
			case 4:
				deleteEmployee();
				break;
			case 5:
				singleEmployee();
				break;
			case 6:
				System.out.println("Exiting......");
				System.exit(0);
		   default:
			   System.out.println("invalid choice");
			}
		}
	}
    static void insertEmployee() {
    	System.out.println("Enter Emloyee id:");
    	long id = sc.nextLong();
    	System.out.println("Enter Employee Name: ");
    	String name=sc.next();
    	System.out.println("Enter Salary");
    	double salary=sc.nextDouble();
    	Employee emp =new Employee(id,name,salary);
    	if(empSet.add(emp))
    		System.out.println("Employee inserted Successfully");
    	else
    		System.out.println("Employee ID already exists");
    }
    static void displayAll() {
    	if(empSet.isEmpty()) {
    		System.out.println("No Employee Found");
    		return;
    	}
    	for(Employee e: empSet) {
    		System.out.println(e);
    	}
    }
    static void updateEmployee() {
    	System.out.println("Enter Employee ID to Update:");
    	long id = sc.nextLong();
    	for(Employee e: empSet) {
    		if(e.getEmpId()==id) {
    			System.out.println("Enter new Name:  ");
    			e.setEmpName(sc.next());
    			System.out.println("Enter new Salary: ");
    			e.setSalary(sc.nextDouble());
    			System.out.println("Employee updated Successfully");
    			return;
    			
    		}
    	}
    	System.out.println("Employee Not Found ");
    }
    static void deleteEmployee() {
    	System.out.println("Enter Employee ID to Delete: ");
    	long id = sc.nextLong();
    	Employee temp = null;
    	for(Employee e: empSet) {
    		if(e.getEmpId()==id) {
    			temp=e;
    			break;
    		}
    	}
    	if(temp != null) {
    		empSet.remove(temp);
    		System.out.println("Employee Deleted Successfully");
    	}
    	else {
    		System.out.println("Employee Not Found");
    	}
    }
    static void singleEmployee() {
    	System.out.println("Enter Employee ID: ");
    	long id = sc.nextLong();
    	for(Employee e: empSet) {
    		if(e.getEmpId()==id) {
    			System.out.println(e);
    			return;
    		}
    	}
    System.out.println("Employee Not Found ");
    }

}