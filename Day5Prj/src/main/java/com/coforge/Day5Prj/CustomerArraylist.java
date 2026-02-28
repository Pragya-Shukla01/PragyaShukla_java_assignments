package com.coforge.Day5Prj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class CustomerArraylist {
	
  public static void main(String[] args) {
	Customer c1= new Customer(1,"swapna","Hyd",56000);
	Customer c2= new Customer(54,"Amit","bglr",30000);
	Customer c3= new Customer(11,"swapna","bglr",37000);
	Customer c4= new Customer(55,"Raj","Hyd",80000);
	Customer c5= new Customer(16,"swathi","Hyd",60000);
	Customer c6= new Customer(34,"pooja","bglr",45000);
	ArrayList<Customer> custList= new ArrayList<Customer>();
	custList.add(c1);
	custList.add(c2);
	custList.add(c3);
	custList.add(c4);
	custList.add(c5);
	custList.add(c6);
//	Collections.sort(custList);
//	custList.sort(new OrderCostComparator());
	custList.sort(new CityComparator().thenComparing(new OrderCostComparator()));
	custList.forEach(cust->System.out.println(cust));
}
}
