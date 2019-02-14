import java.io.IOException;


public class Exam9 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try{
	xecpect();
	System.out.println("hello try");
}
catch(NullPointerException e){
	System.out.println("hello catch");
	System.out.println(e.getMessage());
}
	}

	private static void xecpect()   {
		// TODO Auto-generated method stub
		System.out.println("catch");
		
	}

}
