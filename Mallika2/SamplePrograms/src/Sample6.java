
public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try{
	  throw new NullPointerException("hello");
  }
  catch(ArithmeticException e){
	  System.out.println("catch");
  }
	}

}
