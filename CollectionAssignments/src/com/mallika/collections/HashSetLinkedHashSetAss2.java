package com.mallika.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetLinkedHashSetAss2 {
          HashSet hs;
          LinkedHashSet lhs;
          void add(){
        	  hs=new HashSet();
        	 
        	  hs.add(0);
        	  hs.add(1);
        	  hs.add(8);
        	  hs.add(2);
        	  hs.add(3);
        	  hs.add(4); 
        	  hs.add(14); 
        	  hs.add(5); 
        	  hs.add(6); 
        	  hs.add(7); 
        	  
        	  hs.add(9); 
        	  hs.add(10); 
        	  hs.add(11); 
        	  hs.add(12); 
        	  hs.add(13);
        	  hs.add(15);
        	  
        	 
        	  
        	  
        	  
        	  lhs=new LinkedHashSet();
        	  lhs.add(45);
        	  lhs.add(46);
        	  lhs.add(48);
        	  lhs.add(49);
          }
          void disp(){
        	  System.out.println("hashset"+hs);
        	  System.out.println("linked hash set"+lhs);
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSetLinkedHashSetAss2 hslh=new HashSetLinkedHashSetAss2();
        hslh.add();
        hslh.disp();
	}

}
