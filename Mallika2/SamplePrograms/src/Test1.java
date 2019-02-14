
class Base{
	int value = 0;
        Base(){
        	System.out.println("base");
        	addValue();
        }
        void addValue(){
        	System.out.println("addvalue base");
        	value += 10;
        	System.out.println("base"+value);
        }
        int getValue(){
        	return value;
        }
}
class Derived extends Base{
	Derived(){
		System.out.println("derived");
		addValue();
		
	}
	void addValue(){
		System.out.println("addvalue dervied");
		System.out.println("dervied"+value);
		value +=  20;
		System.out.println(value);
	}
}
public class Test1{
	public static void main(String[] args){
		Base b = new Derived();
		System.out.println(b.getValue());
	}
}