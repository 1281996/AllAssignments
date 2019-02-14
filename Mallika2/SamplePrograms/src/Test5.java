class suer {
	public void printValue() {
		System.out.println("Value-A");
	}
}

class sub1 extends suer {
	public void printNameB() {
		System.out.println("Name-B");
	}
}

class sub2 extends suer {
	public void printNameC() {
		System.out.println("Name-C");
	}
}

public class Test5 {
	public static void main(String[] args) {
		sub1 b1 = new sub1();
		sub2 c1 = new sub2();
		System.out.println(b1);
		System.out.println(c1);
		newPrint(b1);

		newPrint(c1);
		
	}

	public static void newPrint(suer a) {
		System.out.println(a);
		a.printValue();
	}
}