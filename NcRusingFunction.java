package Functions;
import java.util.Scanner;
public class NcRusingFunction {

	public static int FactorialTrail(int num)
	{
		int fact=1;
		for(int i=1; i<=num ; i++)
		{
			fact= fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		int FactN = FactorialTrail(n);
		int FactR = FactorialTrail(r);
		int FactNR = FactorialTrail(n-r);
		
		int result = FactN/(FactR * FactNR);
		System.out.println(result);
	}
	
}
