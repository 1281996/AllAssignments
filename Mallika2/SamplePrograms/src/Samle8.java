
class K{
      public void doA(){
            L b = new L();
            b.dobB();
            System.out.print("doA");
      }
}
class L{
      public void dobB(){
            M c = new M();
            try{
            c.doC();
            }
            catch(Exception ex){
            	System.out.println(ex);
            }
            System.out.print("doB");
      }
}
class M{
      public void doC(){
            if(true)
            throw new NullPointerException();
            System.out.print("doC");
      }
}
public class Samle8{
      public static void main(String args[]){
          
                  K a = new K();
                  a.doA();
           
      }
}