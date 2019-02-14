import java.io.FileNotFoundException;

class Exce42{
	void m4()throws FileNotFoundException
	{
	 //throw new FileNotFoundException();	
	}
}
class Exce43 extends Exce42 {
	void m4() throws RuntimeException{
		
	}
}
public class Samle7 {

	public static void main(String[] args) throws RuntimeException {
		// TODO Auto-generated method stub
		Exce42 exce42=new Exce42();
		
			exce42.m4();
		
			// TODO Auto-generated catch block
			
		
	}

}
