package fundamentals;
import java.util.Scanner;
public class OddSquare {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int a=1;
	while(a<=(2*N))
	{
		System.out.print(a);
		a=a+2;
	}
	System.out.println();
    int i=1;
     while(i<=N-1)
     {
    int j = (2*i)+1;
     while(j<=(2*N))
     {
	System.out.print(j);
	j=j+2;
     }
     int k = 1;
		int m =1;
		while(m<=(2*k)&& m<=(2*i))
		{
			System.out.print(m);
			m=m+2;
			k=k+1;
		}
    System.out.println();
	 i=i+1;
     }
   }
}


