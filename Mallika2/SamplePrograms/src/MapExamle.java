import java.util.HashMap;
import java.util.Map;


public class MapExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"mallika");
		map.put(2,"santhi");
		map.put(15,"prasad");
		/*Set<Map.Entry<Integer, String>> set=map.entrySet();
		for(Map.Entry<Integer, String> set1:set){
			//System.out.println(set1.getKey()+":"+set1.getValue());
	        System.out.println(set1.getValue().equals("santhi"));
	     
		}*/
		
		//Set<Map.Entry<Integer, String>> set=map.entrySet();
		for(Map.Entry<Integer, String> set1:map.entrySet()){
			System.out.println(set1.getKey()+":"+set1.getValue());
	        //System.out.println(set1.getValue().equals("santhi"));
	  
		}
		
		Map<Integer,String> map1=new HashMap<Integer,String>(map);
		System.out.println(map1.entrySet());
		
	}

}
