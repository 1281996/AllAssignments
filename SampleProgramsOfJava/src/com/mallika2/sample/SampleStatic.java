package com.mallika2.sample;

public class SampleStatic {
	 static SampleStatic samplesta=null;
	private static SampleStatic getInstance(){
		if(samplesta==null)
		{
			samplesta=new SampleStatic();
		}
		
		return samplesta;
	}
	public static void main(String args[]){
		
	SampleStatic obj1=SampleStatic.getInstance();
	System.out.println(obj1.hashCode());
	SampleStatic obj2=SampleStatic.getInstance();
	System.out.println(obj2.hashCode());
	
	}

}
