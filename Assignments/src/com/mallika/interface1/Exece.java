package com.mallika.interface1;

public class Exece {
	int count=0;
	void a() throws Exception{
		try{
			count++;
			System.out.println(count);
			try{
				
				count++;
				System.out.println(count);
				try{
					count++;
					System.out.println(count);
				
				   }
				catch(Exception e){
					count++;
					System.out.println(count);
					throw new Exception();	
					
				}
			}
			catch(Exception e)	{
				
				count++;
				System.out.println(count);
				throw new Exception();
			}
		}
		catch(Exception e)	{
			count++;
			System.out.println(count);
			throw new Exception();
			
		}
		}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Exece e=new Exece();
e.a();

	}

}
