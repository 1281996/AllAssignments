class Inner1{
	 static int i1=10;
	 private int i2=9;
Inner2 inner2=new Inner2();

	 int get(){
		 System.out.println(inner2.i);
		 inner2.get1();
		return 0;
		 
	 }
	class Inner2{
		private int  i=0;
		private int get1(){
			System.out.println(	Inner1.i1);
			 System.out.println(i2);
			return i;
		}
	
	}
}
public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner1 inner1=new Inner1();
		
		inner1.get();

	}

}
