package com.mallika2.sample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      ArrayList arraylist=new ArrayList();
     System.out.println (arraylist.size());
         arraylist.add(10);
         arraylist.add(20);
         arraylist.add(20);
         arraylist.add(20);
         arraylist.add(20);
         arraylist.add(20);
         arraylist.add(20);
         arraylist.remove(0);
         System.out.println (arraylist.size());
         System.out.println(arraylist);
         arraylist.add(2,120);
         System.out.println(arraylist);
         arraylist.add(1,121); 
         System.out.println(arraylist);
         arraylist.add(78);
         arraylist.add(20);
         arraylist.add(280);
         System.out.println(arraylist);
         System.out.println(arraylist);
         System.out.println (arraylist.size());
         System.out.println(arraylist);
	}

}
