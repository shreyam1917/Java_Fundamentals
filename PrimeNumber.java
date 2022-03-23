package fundamentals;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want to check for primariality");
	    n = s.nextInt();
	    int div = 2;
	    boolean IsPrime = true;
	    
	    while(div <= n/2)
	    {
	    	if(n%div == 0)
	    	{
	    		IsPrime = false;
	    	}
	    	div = div + 1;
	    }
	    if (IsPrime == true)
	    {
	    	System.out.println("It is a prime number");
	    }
	    else
	    	System.out.println("It is not a prime number");
	}
	
}
