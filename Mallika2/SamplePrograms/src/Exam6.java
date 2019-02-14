class Exc{
	private int i=9;
}
class Exc1 extends Exc {
	public int i=8;
}
public class Exam6 {
	public static void main(String args[])
	{
	Exc exc=new Exc();
	Exc exc2=new Exc1();
	System.out.println(exc2.i);
}
}
