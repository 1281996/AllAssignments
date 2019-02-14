class A{
	
}
class B extends A{
	
}
class C extends A{ 
	
}



public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		C c=new C();
		a=b;
		b=a;
	     b=c;
	     c=a;

	}

}
