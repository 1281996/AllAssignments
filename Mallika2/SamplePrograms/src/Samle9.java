class Dog{
	void dis(){
		System.out.println("dog");
	}
}
class Cat extends Dog{
	void dis(){
		System.out.println("cat");
	}
}
class Ig extends Dog{
	void dis(){
		System.out.println("ig");
	}
}
public class Samle9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Dog dog=new Cat();
		dog.dis();*/
		
		Cat c=new Cat();
		
		
		
		Dog d=new Dog();
		
		Ig ig=new Ig();
		
		
		d=c;
		d=ig;
		d=d; 
		ig=ig;
		c=c;		
		Dog dog;
		dog=c;
		dog.dis();
		dog=d;
		dog.dis();
		dog=ig;
		dog.dis();
		
		
	}

}
