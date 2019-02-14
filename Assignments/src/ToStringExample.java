
public class ToStringExample {
	        String name;
	        String id;
             public ToStringExample(String name,String id) {
				// TODO Auto-generated constructor stub
            	  this.name=name;
            	  this.id=id;
			}
            public String toString(){
            	 return this.name+"and"+this.id;
             }
	public static void main(String[] args) {
		//  TODO Auto-generated method stub
     ToStringExample tostringexample=new ToStringExample("mallika", "y13it842");
     System.out.println(tostringexample);
	}

}
