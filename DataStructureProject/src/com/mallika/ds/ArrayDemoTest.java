package com.mallika.ds;

import java.util.Scanner;

public class ArrayDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  numbers[]=new int[5];
		ArrayDemo arraydemo=new ArrayDemo();
		
		int ele;
	    
		   Scanner scanner=new Scanner(System.in);
		   
		        for(int index=0;index<numbers.length;index++)
		        {
		        	System.out.println("enter number");
		        	 ele=scanner.nextInt();
		        	numbers[index]=ele;
		        }
       
       arraydemo. print(numbers);
       arraydemo.Ascending(numbers); 
        System.out.println("asending order");
        arraydemo.print(numbers);
        arraydemo.Desnding(numbers);
        System.out.println("desending order");
        arraydemo.print(numbers);
        System.out.println("array length");
        arraydemo.arraySize(numbers);
        System.out.println("big ele");
        arraydemo.findBig(numbers);
        System.out.println("small ele");
        arraydemo.findSmall(numbers);
    
    
    
     
    
     

}

}
