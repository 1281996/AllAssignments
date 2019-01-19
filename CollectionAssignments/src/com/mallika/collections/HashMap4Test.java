package com.mallika.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMapAsig4 hashmap1=new HashMapAsig4(12,8,1996);
     HashMapAsig4 hashmap2=new HashMapAsig4(12,8,1997);
     HashMap map=new HashMap();
     map.put(hashmap1, "mallika");
     map.put(hashmap2, "santhi");
     
     System.out.println(map);
	}

}
