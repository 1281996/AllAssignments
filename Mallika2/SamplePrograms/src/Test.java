class Mammal{
      void eat(Mammal a){
            System.out.println("Mammal eats food");
      }
}
class Cattle extends Mammal{
      void eat(Cattle b){
            System.out.println("Cattle eats hay");
      }
}
class Horse extends Cattle{
      void eat(Horse c){
            System.out.println("Horse eats hay");
      }
}
public class Test{
      public static void main(String[] args){
    	 /* Mammal1 m=new Mammal1();
            Horse ho=new Horse();
            ho.eat(m);*/
            
            Mammal m = new Cattle();
            Cattle c = new Horse();
                 
           c.eat(m);
           m.eat(m);

          
      }
}