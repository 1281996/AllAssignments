package com.mallika.collections;

import java.util.Hashtable;



public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee5 emp1=new Employee5(34,"mallika");
    Employee5 emp2=new Employee5(34,"mallika");
    System.out.println(emp1.equals(emp2));
    
    Hashtable<Employee5,String> hash=new Hashtable();
    hash.put(emp1, "hi");
    hash.put(emp2, "hio");
    hash.get(emp1);
    hash.get(emp2);
    System.out.println(hash);
    System.out.println(emp1.hashCode());
    System.out.println(emp2.hashCode());
    
    
    
    
	}

}
