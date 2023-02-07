package fundamentals;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int a=1,b=1;
	    if(n<=2 & n>=1)
	    {
	    	System.out.println("1");
	    	
	    }
	    for(int i =3; i<=n ; i++ )
	    {
	    	int r=a+b;
	    	a=b;
	    	b=r;
	    	while(i==n)
	    	{
	    		System.out.println(r);
	    		break;
	    	}
	    }
	}
}
