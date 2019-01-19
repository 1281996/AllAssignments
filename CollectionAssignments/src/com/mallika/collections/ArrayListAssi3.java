package com.mallika.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListAssi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList list=new ArrayList();
      
       list.add(10);
       list.add(60);
       list.add(80);
       list.add(50);
       list.add(20);
       System.out.println(list);
       ListIterator itrr = list.listIterator();
       
       
       System.out.println("Iterating in forward direction");
       while(itrr.hasNext())
        System.out.println(itrr.next());
       System.out.println("Iterating in backward direction");
       while(itrr.hasPrevious()){
    	      System.out.println(itrr.previous());
    	     } 
	}

}
