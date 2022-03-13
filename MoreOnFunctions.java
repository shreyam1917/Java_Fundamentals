package Functions;
import java.util.Scanner;
public class MoreOnFunctions {
	
//	public static int Sum(int i , int j) 
//	{
//		 int sum = i + j;
//         return sum;
//	}
//	
//public static void main(String[] args) {
//
//	Scanner s = new Scanner(System.in);
//	int a = s.nextInt();
//	int b = s.nextInt();
//	
//	int result = Sum(a , b);
//	System.out.println(result);
//}
	
	public static void EvenNumbers(int num1 , int num2)
	{
		for( int i= num1; i<=num2; i=i+1 )
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int B = s.nextInt();
		int E = s.nextInt();
		
		EvenNumbers(B , E);
}
	}
