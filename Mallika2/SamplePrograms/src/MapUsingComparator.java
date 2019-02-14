import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class Emp{   
	int id;
	String name;
	
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
}


class Mycom implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return e2.name.compareTo(e1.name);
	}
	
}





public class MapUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);*/
		Mycom mycom=new Mycom();
		TreeMap<Emp,Integer> map=new TreeMap(mycom);
		  map.put( new Emp(101,"mallika"),8);
    System.out.println(map.put( new Emp(101,"mallika"),9));
    map.put( new Emp(101,"mallika"),9);
    map.put( new Emp(102,"rasad"),8);
    map.put( new Emp(102,"arasad"),9);
    
   
   map.put( new Emp(102,"chacha"),9);
   
  
    
   System.out.println(map.containsValue(18));
  Set<Map.Entry<Emp,Integer>> entry=map.entrySet();
  System.out.println(entry);
   for( Map.Entry<Emp,Integer> entry2:map.entrySet()){
	   System.out.println(entry2.getKey()+" "+entry2.getValue());
   }
   
   
    
    
    
    
    
    
    
    System.out.println(map.remove(new Emp(102,"rasad")));
    //map.put( new Emp(102,"arasad"),5);
    System.out.println("MA"+map);
    TreeMap<Emp,Integer> map5=new TreeMap(mycom);
    map5.putAll(map);
    System.out.println("MA5"+map5);
    /*TreeMap<Emp,Integer> map1=new TreeMap(map);
   map1.putAll(map);
    System.out.println(map1);*/
    
    
    
    
    
    
    TreeMap<Integer,Integer> map4=new TreeMap<Integer,Integer>();
    map4.put(2, 8);
     
      
    map4.put(1, 6);
    map4.put(5, 3);
    map4.put(6, 3);
   System.out.println(map4.subMap(2, 6)) ;
    
   
    
    
	}

}
