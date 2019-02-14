import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Air{
	int hello(){
		return 0;
		
	}
}

class  Air1 extends Air{
	int hello(){
		return 0;
		
	}
}
public class Samle45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List <Integer>list=new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    List <Integer> list2=Collections.unmodifiableList(list);
    list.add(50);
    list2.add(70);
    System.out.println(list);
	}

}
