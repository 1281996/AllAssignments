import java.util.ArrayList;
import java.util.ListIterator;


public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList al=new ArrayList();
     al.add("mallika");
     al.add("helo");
     ListIterator it=al.listIterator();
     it.next();
     System.out.println(it.next());
     System.out.println(al);
	}

}
