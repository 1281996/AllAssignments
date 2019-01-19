
public class CompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1="mallika";
   String s2="prasadk";
   String s3=new String("mallika");
   String s4=new String("mallik8a");
   int len=s1.compareTo(s2);
      
   
   System.out.println(len);
     if(s3==s4){
    	 System.out.println("strigs are equal");
     }
     else{
    	 System.out.println("strigs are not equal");
     }
     if(s3.equals(s4)){
    	 System.out.println("strigs are equal");
     }
     else{
    	 System.out.println("not equal");
     }
	}

}
