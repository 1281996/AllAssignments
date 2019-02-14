class Suert {
	void dis(Suert suer) {
		System.out.println("suer");
	}

}

class Subt extends Suert {

	void dis(Subt subt) {
		System.out.println("subclass");
		System.out.println("subclass");
	}
}

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suert suert = new Subt();

		Subt subt = new Subt();

		subt.dis(suert);
	}

}
