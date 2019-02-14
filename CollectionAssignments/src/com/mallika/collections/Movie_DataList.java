package com.mallika.collections;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;

public class Movie_DataList {
	 LinkedList<MovieDetails> linkedList;
	   void add_movie(){
		    linkedList=new LinkedList<>();
			  
		   
		 
		   linkedList.add(new MovieDetails("googly", "yash", "kurthi"));
		   linkedList.add(new MovieDetails("100%love", "nagachainthya", "tamanna"));
		   linkedList.add(new MovieDetails("bahubai", "prabahs", "tamanna"));
		   System.out.println(linkedList);
		  
		   
		   
	   }
	   void remove(int index){
		   linkedList.remove(index);
		   System.out.println(linkedList);
	   }
  void removeAll(){
	  linkedList.removeAll(linkedList);
	  System.out.println(linkedList);
  }
  void findMovie(int index){
	  linkedList.indexOf(index);
	  System.out.println(linkedList);
  }
  void sort(){
	  Collections.sort(linkedList);
	  for(MovieDetails movie:linkedList){
		  System.out.println(movie);
	  }
  }

   public static void main(String args[]){
	   Movie_DataList movie=new Movie_DataList();
	   movie.add_movie();
	   movie.remove(1);
	  
	   movie.findMovie(1);
	  
	   movie.sort();
	   movie.removeAll();
   }
}
