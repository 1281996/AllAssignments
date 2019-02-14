
class First{
	public void method1(){
		System.out.print("Class A method1");
	}
}
class Second extends First{
	public void method2(){
		System.out.print("Class B method2");
	}
}
class Third extends Second{
	public void method2(){
		System.out.print("Class C method2");
	}	
	public void method3(){
		System.out.print("Class C method3");
	}
}
public class TestInher{
	public static void main(String args[]){
		First a = new First();
		
		Third c = new Third();	
		
		c.method2();
		a = c;

		// a.method3();
	}
}
