package com.mallika.ds;



public class ArrayDemo {
	
	public void Ascending(int numbers[]){
		 for(int index=0;index<numbers.length;index++){
	    	    for(int index1=0;index1<numbers.length;index1++){
	    	    	  if(numbers[index]<numbers[index1])
	    	    	  {
	    	    		  int temp=numbers[index];
	    	    		      numbers[index]=numbers[index1];
	    	    		      numbers[index1]=temp;
	    	    	  }//if
	    	    }//for
	     }//for
		
	}//asending
	
	
	//array size
	public  void arraySize(int numbers[]){
		  int length=numbers.length;
		  System.out.println(length);
	}
	
	public  void findBig(int numbers[]){
		
		 Ascending(numbers); 
		
		 System.out.println(numbers[numbers.length-1]);
	}
	public  void findSmall(int numbers[]){
		
		 Ascending(numbers); 
		
		 System.out.println(numbers[0]);
	}
	
	
	
	
	
	
	public  void Desnding(int numbers[]){
		 for(int index=0;index<numbers.length;index++){
	    	    for(int index1=0;index1<numbers.length;index1++){
	    	    	  if(numbers[index]>numbers[index1])
	    	    	  {
	    	    		  int temp=numbers[index];
	    	    		      numbers[index]=numbers[index1];
	    	    		      numbers[index1]=temp;
	    	    	  }//if
	    	    }//for
	     }//for
		
	}//desending
	
	
	
	
	//printing elements
	public  void print(int numbers[]){
		  for(int index=0;index<numbers.length;index++){
		    	 System.out.println(numbers[index]);
		     }//for
	}//print
	
	
	

	
}
