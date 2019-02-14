import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;


class One{
      final int a = 15;
}

class Two extends One{
      final int a = 20;
}

public class Test3 extends Two{
      final int a = 30;

      public static void main(String args[]){
            One t = new Test3();
            
            System.out.print(t.a);
            String string=new String();
            Object object=new Object();
            
            String string1="mallika";
            String string2="mallika";
            
            
            String string3=new String("mallika");
            
            String string4=new String("mallika");
            
            System.out.println(string1==string2);
            System.out.println(string1==string3);
            
            System.out.println(string4==string3);
            
            
            
            
            System.out.println(string1.equals(string2));
            System.out.println(string1.equals(string3));
            
            System.out.println(string4.equals(string3));
           /* System.out.println(string2==string3);
            
            System.out.println(string2.equals(string3));
            */
          
            
            
         HashMap<String, String> hashMap=new HashMap<String, String>();
         hashMap.put(new String("mallika"), "malli");
         hashMap.put(new String("mallika"), "malli");
         HashMap<Integer, Integer> hashMap1=new HashMap<Integer, Integer>();
         
         
         System.out.println(hashMap);
         
         
         
         List<Integer> list1=new Vector();
         
         list1.add(2);
         list1.add(3);
         Enumeration<Integer> enumeration=Collections.enumeration(list1);
     while(enumeration.hasMoreElements()){
    	 //list1.add(4);
    	 System.out.println(enumeration.nextElement());
    	 
     }
            
     List<Integer> list4=new ArrayList<Integer>();   
     list4.add(9);
     Enumeration<Integer> enumeration1=Collections.enumeration(list4); 
     while(enumeration1.hasMoreElements()){
    	 //list1.add(4);
    	 System.out.println(enumeration1.nextElement());
    	 
     }
      }
}