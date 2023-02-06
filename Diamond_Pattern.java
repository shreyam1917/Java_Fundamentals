package fundamentals;
import java.util.Scanner;
public class Diamond_Pattern {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int lines = s.nextInt();
	int mid = (lines+1)/2;
	
	//Upper
	int i=1;
	while(i<=mid)
	{
		int j=1;
		while(j<=(mid - i))
		{
			System.out.print(" ");
			j=j+1;
		}
		int k =1;
		while(k<=((2*i)-1))
		{
			System.out.print("*");
			k=k+1;
		}
		System.out.println();
		i=i+1;
	}
	int l=1;
	while(l<=mid-1)
	{
		int j=1;
		while(j<=(l))
		{
			System.out.print(" ");
			j=j+1;
		}
		int k =1;
		while(k<=2*(mid-l)-1)
		{
			System.out.print("*");
			k=k+1;
		}
		System.out.println();
		l=l+1;
	}
	
//	for(int i=1; i<=mid; i++)
//	{
//		for(int j=1; j<=(mid-i); j++)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1; k<=((i*2)-1); k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	for(int i=1; i<=mid-1; i++)
//	{
//		for(int j=1; j<= i; j++)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1; k<=(2*(mid-i)-1); k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
}
}
