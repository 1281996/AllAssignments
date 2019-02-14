package com.mallika.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.lang.*;

public class HashMapAsig4 {
	int dd;
	int mm;
	int yyyy;
	public HashMapAsig4(int dd,int mm,int yyyy) {
		// TODO Auto-generated constructor stub
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	public String toString(){
		return dd+" "+mm+" "+yyyy;
		
	}
	
	}

