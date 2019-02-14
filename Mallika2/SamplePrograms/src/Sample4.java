
public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			
			int i;
			System.out.println("hello finally"+1/0);
			return;
			
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		finally{
			System.out.println("hello finally");
		}
	}

}
