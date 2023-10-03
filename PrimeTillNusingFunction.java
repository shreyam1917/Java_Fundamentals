package Functions;
import java.util.Scanner;
public class PrimeTillNusingFunction 
{
	public static void Prime(int a , int b)
	{
		for(int i=a;i<=b;i++)
		{
			int count =0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				count++;
			}
			if(count==1)
				System.out.print(i+" ");
		}
	}
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the starting number");
	int N = s.nextInt();
	System.out.println("Enter the end number");
	int E = s.nextInt();
	Prime(N,E);
}
}
