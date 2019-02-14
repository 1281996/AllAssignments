import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;





public class UserDAO 



{  
	Connection con=null;
	void Conne(){
		
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		 con = DriverManager.getConnection( 
		     "jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1");
			
		    Statement st = con.createStatement(); 
		    int m = st.executeUpdate(sql); 
			    if (m == 1) 
			        System.out.println("inserted successfully : "+sql); 
			    else
			        System.out.println("insertion failed"); 
			    con.close(); 
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
   
	
}//class

//String sql = "insert into student1 values('"+name+"',"+roll+",'"+cls+"')"; 

//try
//{ 
//	  Connection con=null;
//	 Class.forName("oracle.jdbc.driver.OracleDriver"); 
//    
//    // Establishing Connection 
//     con = DriverManager.getConnection( 
//     "jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1");
//
//    Statement st = con.createStatement(); 
//    int m = st.executeUpdate(sql); 
//    if (m == 1) 
//        System.out.println("inserted successfully : "+sql); 
//    else
//        System.out.println("insertion failed"); 
//    con.close(); 
//} 
//catch(Exception ex) 
//{ 
//    System.err.println(ex); 
//} 