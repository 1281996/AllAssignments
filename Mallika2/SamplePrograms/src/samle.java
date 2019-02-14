@FunctionalInterface
public interface samle {
	public void dis();
	public  default  void dis2(){
	System.out.println("dis2");
	}
	public static void dis3(){
		System.out.println("dis3");
	}
}
