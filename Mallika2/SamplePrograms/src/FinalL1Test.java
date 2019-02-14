
public class FinalL1Test {
	static void doStuff(){
		throw new Exception();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	doStuff();
}
catch(Exception e){
	System.out.println("exception");
	}
	

}
}
