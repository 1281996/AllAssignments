
public class Exception2 {
	int z=6;
void method1(int z){
	System.out.println(z);
	z=5;
	System.out.println("method1"+z);
	method2();
}	
	
	

	private void method2() {
	//int z=7;
	System.out.println("method1"+z);
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception2 exception2=new Exception2();
		int z=10;
		exception2.method1(z);
		System.out.println(exception2.z);
	}

}
