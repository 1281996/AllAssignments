
public class MyList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="mallik";
      String s2="mallik";
      String s3=new String("mallik");
      String s4=new String("mallik");
      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
      System.out.println(s3.hashCode());
      System.out.println(s4.hashCode());
     System.out.println(s1==s2);
     System.out.println( s1==s3);
     System.out.println( s4==s3);
     System.out.println(s1.equals(s2));
     System.out.println(s1.equals(s3));
     System.out.println(s3.equals(s4));
	}

}
