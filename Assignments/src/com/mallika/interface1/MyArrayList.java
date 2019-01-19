package com.mallika.interface1;
public class MyArrayList {
	   public  int arr[];
	   int ele;
	MyArrayList(int array[])
	{
	
		this.arr=array;
	
	}
	void getAll()
	 {
		 System.out.println("length=>"+arr.length);
		 for(int index=0;index<arr.length;index++)
		 {
			 System.out.println(arr[index]);
		 }//for
	}//getAll
	void get(int ele)
	       {
		for(int index=0;index<arr.length;index++){
			if(ele==arr[index])
			  {
				System.out.println("ele is found at"+index);
			   }//for
		}//get
		
	}
	void add(int pos,int ele,int arr[]){
		System.out.println(arr.length);
		for(int i=arr.length; i>=pos; i--)
        {
			//System.out.println(arr.length);
            arr[i] = arr[i-1];
        }
        
        /* Insert new element at given position and increment size */
        arr[pos-1] = ele;
         
        
        
	}
	void update(int updatele){
		
		
		
		 int count =0;
	        for (int i=0; i<arr.length; i++) {
	            if (arr[i] ==updatele) {
	                count++;
	                arr[i]=50;
	            }//if
	            
	        }//for
	        if(count==0){
	        	System.out.println("not updated");
	        }
	        else
	        {
	        	System.out.println("ele is updated");
	        }
	}
	void remove(int del){
		
		int count=0;
		
		for(int i=0; i<arr.length; i++)
	       {
	           if(arr[i] == del)
	           {
	               for(int j=i; j<(arr.length-1); j++)
	               {
	                   arr[j] = arr[j+1];
	               }
	               count++;
	               break;
	           }
	       }
	       if(count==0)
	       {
	           System.out.print("Element Not Found..!!");
	       }
	       else
	       {
	           System.out.print("Element Deleted Successfully..!!");
	           System.out.print("\nNow the New Array is :\n");
	           for(int i=0; i<(arr.length-1); i++)
	           {
	               System.out.print(arr[i]+ " ");
	           }
	       }
		
	}
   public static void main(String args[]){
	   MyArrayList myarraylist=new MyArrayList(new int[]{111,222,333,444,555});
	   //System.out.println(arr.length);
	    myarraylist.getAll();
	    myarraylist.get(333);
	    myarraylist.remove(555);
	    myarraylist.getAll();
	    int arr[]=new int[6];
	    
	    myarraylist.update(444);
	    myarraylist.getAll();
	    
	   
	    myarraylist.add(2,444,arr);
   }
   
}