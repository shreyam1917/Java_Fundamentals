package fundamentals;
import java.util.Scanner;
public class HalfDiamond {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	System.out.println("*");
	//Upper traingle
	int i =1;
	while(i<=N)
	{
		System.out.print("*");
		int j = 1;
		while(j<=i)
		{
			System.out.print(j);
			j=j+1;
		}
		j=j-2;
		while(j>=1)
		{
			System.out.print(j);
			j=j-1;
		}
		
		System.out.print("*");
		System.out.println();
		i=i+1;
		
	}
	int f = N-1;
	int k =1;
	while(k<=N-1)
	{
		System.out.print("*");
		 int l =1;
		while (l<=f)
		{
			System.out.print(l);
			l=l+1;
		}
		l=l-2;
		while(l>=1)
		{
			System.out.print(l);
			l=l-1;
		}
		System.out.print("*");
		System.out.println();
		k=k+1;
		f=f-1;
	}
	System.out.println("*");
}
}
