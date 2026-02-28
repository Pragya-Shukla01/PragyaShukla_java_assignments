package com.coforge.Day5Prj;
import java.util.*;
public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        ArrayList alist=new ArrayList();
//        alist.add("Swapna");
//        alist.add(56);//wrapped by wrapper class Integer
//        alist.add(true);
//        alist.add(78.96);
//        alist.add(45.67f);
//        alist.add('S');
//        for(int i=0;i<alist.size();i++)
//        	System.out.println(alist.get(i));
//        System.out.println("-----------------------------");//Duplicates are allowed
////        alist.add("Swapna");
////        alist.add(56);//wrapped by wrapper class Integer
////        alist.add(true);
////        alist.add(78.96);
////        alist.add(45.67f);
////        alist.add('S');
////        for(int i=0;i<alist.size();i++)
////        	System.out.println(alist.get(i));
//        alist.add(null);
//        alist.add(null);
//        for(int i=0;i<alist.size();i++)
//        	System.out.println(alist.get(i));
		ArrayList<Integer> intAlist = new ArrayList<Integer>();
         intAlist.add(54);
         intAlist.add(90);
         intAlist.add(33);
         intAlist.add(34);
         intAlist.add(34);
         //intAlist.add(null);
//         System.out.println(intAlist);
//         for(int i =0;i<intAlist.size();i++) {
//        	 System.out.println(intAlist.get(i));
//         }
//         for(Integer i : intAlist)
//        	 System.out.println(i);
//         Integer iobj = 567;
//         int i1= iobj.intValue();//-unboxing
      System.out.println("******************************************");
//      Iterator<Integer> itr = intAlist.iterator();
//      while(itr.hasNext())
//      {
//    	  Integer i =itr.next();
//    	  if(i==34)
//    		  itr.remove();
//    	  System.out.println(i);
//      }
//          System.out.println("After iteration  arrayList is");
//    	  System.out.println(intAlist);
//      System.out.println("forward direction list values");
//      ListIterator<Integer> listItr= intAlist.listIterator();
//      while(listItr.hasNext())
//    	  System.out.println(listItr.next());
//      System.out.println("reverse direction of list values");
//      while(listItr.hasPrevious())
//    	  System.out.println(listItr.previous());
      
//	
  ArrayList<Integer> alist=new ArrayList<Integer>();
  alist.add(54);
  alist.add(33);
  alist.add(90);
  alist.add(0,11);
  System.out.println(alist);
  intAlist.addAll(3,alist);
  System.out.println("After add all method");
  System.out.println(intAlist);

//  System.out.println(intAlist);
//      intAlist.remove(2);
//      System.out.println(intAlist);
//      Integer i = 34;
//      intAlist.remove(i);
//      System.out.println(intAlist);
//  intAlist.removeAll(alist);
//  System.out.println("After removal: ")";
//  System.out.println(intAlist);
//  System.out.println(alist);
//      
      intAlist.replaceAll(e->e+10);
      System.out.println(intAlist);
//      System.out.println("Before clear"+alist);
//      alist.clear();
//      System.out.println("After clear"+alist);
//      Integer i= 999;
//     addFirst
//      System.out.println(intAlist);
      
      ArrayList<Integer> clonedArrayList= (ArrayList<Integer>)alist.clone();
      System.out.println(clonedArrayList);
      System.out.println(alist.hashCode());
      System.out.println(clonedArrayList.hashCode());
//      clonedArrayList.add(78);
//      alist.add(67);
//      System.out.println(alist);
//      System.out.println(clonedArrayList);
//      System.out.println(alist.hashCode());
//      System.out.println(clonedArrayList.hashCode());
//      System.out.println(alist.contains(67));   
//       System.out.println(alist.containsAll(intAlist));
//      alist.forEach(e->System.out.println(e));
//      System.out.println(alist.indexOf(54));
//      intAlist.retainAll(alist);
//      System.out.println(intAlist);
//     System.out.println(alist.toString().getClass()); 
      
      Collections.sort(alist);
      System.out.println(alist);
      
}
}
