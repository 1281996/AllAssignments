package com.mallika.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;
public class TreesetAssignment1 implements Comparable<TreesetAssignment1>{
 String name;
     double height;
     double weight;
     public TreesetAssignment1(String name,double height,double weight) {
		// TODO Auto-generated constructor stub
    	 this.name=name;
    	 this.height=height;
    	 this.weight=weight;
	}
	
public int compareTo(TreesetAssignment1 tree){
	  if(height==tree.height)
	  {
		  if(weight>tree.weight){
			  return 1;
		  }
		  else
		  {
			  return -1;
		  }
	
	  }
	   if(height>tree.height)
	   {
		   return 1;
	   }
				 
	return -1;
}
	
          
	
	 
}
