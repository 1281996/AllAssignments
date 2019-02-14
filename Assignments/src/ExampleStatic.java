
public class ExampleStatic {
	   static int num;
	     int num2;
     public ExampleStatic(int num,int num2) {
		// TODO Auto-generated constructor stub
    	this.num=num;
    	this.num2=num2;
    	
    	 System.out.println(++num);
    	 
    	 System.out.println(num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ExampleStatic es=new ExampleStatic(12,13);
         ExampleStatic es1=new ExampleStatic(15,13);
       

}
}
