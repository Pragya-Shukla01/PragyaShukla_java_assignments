package com.coforge.Day5Prj;
import java.util.LinkedList;
import java.util.List;
public class DemoOnLinkedList {
 public static void main(String[] args) {
	 LinkedList<Integer>llist=new LinkedList<Integer>();
	 llist.add(55);
	 llist.add(56);
	 llist.add(34);
	 llist.add(33);
	 llist.add(10);
	 System.out.println(llist);
	 llist.addFirst(77);
	 llist.addLast(45);
	 System.out.println(llist);
	 System.out.println(llist.element());
	 LinkedList<Integer> llist1=new LinkedList<Integer>();
	 llist1.add(55);
	 llist1.add(56);
	 llist1.add(34);
	 llist1.add(33);
	 llist1.add(10);
	 System.out.println(llist1);
	 llist1.addFirst(77);
	 llist1.addLast(45);
	 System.out.println(llist.equals(llist1));
	
}
}
