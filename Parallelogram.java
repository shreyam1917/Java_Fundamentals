package fundamentals;
import java.util.Scanner;
public class Parallelogram {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N= s.nextInt();
	int a =1;
	while(a<=N)
	{
		System.out.print("*");
		a=a+1;
	}
	System.out.println();
	int f = 1;
	int i =1;
	while(i<=f && i<=N-1)
	{
		int k=1;
		while(k<=i)
		{
			System.out.print(" ");
			k=k+1;
		}
		int j=1;
		while(j<=N)
		{
			System.out.print("*");
			j=j+1;
		}
		System.out.println();
		i=i+1;
		f=f+1;
	}
	
}
}
