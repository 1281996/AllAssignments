class Test19{
	void dis11()  {
		System.out.println("dis11");
		
			try {
				Test22.dis22();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
		
			// TODO Auto-generated catch block
			
		System.out.println("dis11 second time");
	}
	
}
class Test22{
	static void dis22() throws Exception {
		System.out.println("dis22");
		
			throw new Exception();
	
			// TODO Auto-generated catch block
		
	}
}
public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test19 test11=new Test19();
		
			
			test11.dis11();
			
			
			
		}
	}


