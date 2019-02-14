
class classa{
      public void printName(){
            System.out.println("Name-A");
      }
}
class classb extends classa{
      public void printName(){
            System.out.println("Name-B");
      }
}
class classc extends classa{
      public void printName(){
            System.out.println("Name-C");
      }
}

 public class Test6{      public static void main (String[] args)
 {    classa a=new classa();    
 classb b = new classb();
 classc c = new classc();
              a=b;
             newPrint(b);
       }
       public static void newPrint(classa a){
             a.printName();
      }
 }