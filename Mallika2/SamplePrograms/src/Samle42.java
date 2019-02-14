class Ale{
	final private int hello(){
		System.out.println("hello ale");
		return 0;
		
	}
}
class mango extends Ale{
	final private int hello(){
		System.out.println("hello mango");
		return 0;
		
	}
}
class Samle42 {
	private Samle42(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samle42 samle42=new Samle42();
		
		 mango m1=new mango();
	
	}

}
