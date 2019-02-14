package com.mallika.interface1;


import java.util.ArrayList;
import java.util.List;

public interface MyList {
	void add(int pos,int ele,int arr[]);
	void update(int updatele);
	void remove(int ele);
	void get(int ele);
	void getAll(int arr[]);
	
	
	List<String> list=new ArrayList();
	

}
