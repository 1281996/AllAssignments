import java.util.Scanner;


public class Armstrong {
	 public static void armstrong(int number){
		 
	
	int temp;
	int sum1=0;
	temp=number;
	while(number>0)
	{
		 int arm=number%10;
		 sum1=sum1+arm*arm*arm;
		 number=number/10;
	}
	if(temp==sum1)
	{
   System.out.println(sum1);
   System.out.println("given number is armstrong");
	}
	 
}
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			armstrong(num);

		}
}
