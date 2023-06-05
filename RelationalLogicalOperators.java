package fundamentals;
import java.util.Scanner;

public class RelationalLogicalOperators {

	public static void main(String[] args) {
//		int a= 8;
//		int b = 12;
	
//		//Relational operators
//		
//		System.out.println(a>b);
//		System.out.println(a<b);
//		System.out.println(a==b);
//		System.out.println(a!=b);
//		System.out.println(a<=b);
//		System.out.println(a>=b);
//		
//		//Logical Operators( and && , or || , not ! )p;ue478
//		
//		System.out.println(a<b && b>a);
//		System.out.println(a>b || b>a);
//		System.out.println(!(a==b));

	
		Scanner n = new Scanner(System.in);
		int k = n.nextInt();
		int s = n.nextInt();
		
//		if(k<s && s==5)
//		{
//			System.out.println("Made for each other");
//		}
//		else
//		{
//			System.out.println(" Not made for each other");
//		}
//		if(k<s || s==5)
//		{
//			System.out.println("Made for each other");
//		}
//		else
//		{
//			System.out.println(" Not made for each other");
//		}
		
		if (k<s)
		{
			System.out.println("K feels S is everything.");
		}
		else if (k>s)
		{
			System.out.println("K feels himself everything.");
		}
		else
		{
			System.out.println("Both feel each other equal.");
		}
	}
}
