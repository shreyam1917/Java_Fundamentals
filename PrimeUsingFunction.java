package Functions;
import java.util.Scanner;

public class PrimeUsingFunction {
	public static boolean Prime2(int num)
	{
		int div = 2;
	    boolean IsPrime = true;
	    
	    while(div <= num/2)
	    {
	    	if(num%div == 0)
	    	{
	    		IsPrime = false;
	    		break;
	    	}
	    	div = div + 1;
	    }
	    if (IsPrime)
	    {
	    	return true;
	    }
	    else
	    	return false;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want to check for primariality");
	    int n = s.nextInt();
	    boolean isPrime=Prime2(n);
	    System.out.println(isPrime);
	    
	}
	
}
