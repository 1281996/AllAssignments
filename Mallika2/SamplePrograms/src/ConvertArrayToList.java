import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertArrayToList {

	public static void main(String[] args) {

		HashSet<Integer> hashSeta = new HashSet<Integer>();
		hashSeta.add(6);
		hashSeta.add(3);
		hashSeta.add(7);
		hashSeta.add(8);
		hashSeta.add(9);
		System.out.println("Hashset Integers" + hashSeta);

		Set<Integer> hashSetb = new HashSet<Integer>();
		
		hashSetb.add(1);
		hashSetb.add(8);
		hashSetb.add(4);
		hashSetb.add(6);
		hashSetb.add(16);

		System.out.println("Hashset Integers second time" + hashSetb);
		
		
		
		HashSet<Integer> hashSetc = new HashSet<Integer>();
		
		hashSetc.add(8);
		hashSetc.add(7);
		hashSetc.add(5);
		hashSetc.add(2);
		
		System.out.println("Hashset Integers third time" + hashSetc);
		
		
		
		
		
		
		
		
		

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(null);
		arrayList.add(45);
		arrayList.add(10);
		arrayList.add(7);
		arrayList.add(7);
		arrayList.add(8);
	
		
		arrayList.add(11);
		System.out.println("arraylist" + arrayList);

		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.addAll(arrayList);
		System.out.println("hasset" + hashSet);

		Set<Integer> treeSet = new TreeSet<Integer>();

		treeSet.addAll(arrayList);

		System.out.println("trreset" + treeSet);

		Set<String> daysOfWeek = new HashSet<>();

		// Adding new elements to the HashSet
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");

		// Adding duplicate elements will be ignored
		daysOfWeek.add("Monday");

		System.out.println(daysOfWeek);

	}

}
