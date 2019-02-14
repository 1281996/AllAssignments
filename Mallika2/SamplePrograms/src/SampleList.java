import java.util.ArrayList;
import java.util.List;


public class SampleList {

	public SampleList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List l=new ArrayList();
		l.add("1");
		l.add("2");
		l.add(1,"3");
		l.remove(2);
		System.out.println(l);
	}

}
