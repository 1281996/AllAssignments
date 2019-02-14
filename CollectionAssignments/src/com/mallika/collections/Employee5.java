package com.mallika.collections;

public class Employee5 {
int id;
String name;
public Employee5(int id,String name) {
	// TODO Auto-generated constructor stub
	this.id=id;
	this.name=name;
}
public boolean equals(Object obj){
	//Employee5 emp=(Employee5)obj;
	return id==this.id && name==this.name;
	
}
public int hashCode(){
	return id;
	
}
public String toString(){
	return id+" "+name+" ";
}
}
