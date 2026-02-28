package com.coforge.Day5Prj;

import java.util.Comparator;

public class OrderCostComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getOrderCost()-o2.getOrderCost());
	}

}
