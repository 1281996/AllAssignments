 class A1{
	 int i=10;
	 void hello1(int a){
		System.out.println("hello1");
	}
 }

class A2 extends A1{
void hello2(float b){
	System.out.println("hello2");
	}
 }
class A3 extends A2{
void hello3(String c){
	System.out.println("hello3");	
	} 
}


public class TestSamleInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*A1 a=new A2();
  A1 b=new A3();
  */
		
		A3 obj=new A3();
		obj.hello1(2);
		obj.hello2(6.8f);
		obj.hello3("hello");
		System.out.println(obj.i);
		
		
		A2 obja2=new A2();
		
		obja2.hello1(5);
		obja2.hello2(9f);
		
		A1 obj3= new A1();
		obj3.hello1(8);
		
		
		A1 obj11=new A2();
		
		obj11.hello1(7);
		
		
		
		
	}

}
