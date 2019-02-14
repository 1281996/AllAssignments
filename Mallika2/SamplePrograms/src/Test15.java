class Rect{
	public int area(int len,int width){
		return len*width;
		
	}
}
class Square extends Rect{
	public int area(long len,float width){
		return (int)Math.pow(len, 2);
		
	}
}
public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square=new Square();
		System.out.println(square.area(3, 4f));
	}

}
