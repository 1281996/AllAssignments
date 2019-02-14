 class DemoClass
{
   //some code
    

    String hello()
   {
	return null;
     
   }
    
}
 class DemoClass1 extends DemoClass
{
	 @Override
    String hello()
   {
	   return null;
   }
 
   public static void main(String[] args) {
	   DemoClass demoClass=new DemoClass1();
	  
}
}