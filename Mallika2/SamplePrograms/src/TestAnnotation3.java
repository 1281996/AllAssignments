@Deprecated
class Anno{  
void m(){System.out.println("hello m");}  
  
@Deprecated  
void n(){System.out.println("hello n");}  
}  
  
class TestAnnotation3{  
public static void main(String args[]){  
  
	Anno a=new Anno();  
a.n();  
}}  