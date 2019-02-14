import java.sql.SQLException;


public class Sample5 {
	
	static void show() throws SQLException {
		try{
			if(true){
				System.out.println("before");
				throw new SQLException();
			}
			
			throw new RuntimeException();
			/*System.out.println("aefore1");*/
		}
		catch(RuntimeException e){
			e.getMessage();
		}
	}

	public static void main(String[] args)  throws SQLException{
		// TODO Auto-generated method stub
      Sample5.show();
	}

}
