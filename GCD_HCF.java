
package Functions;
import java.util.Scanner;
final class GCD_HCF {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the numbers");
	int a = s.nextInt();
	int b = s.nextInt();
	int q = GCD_Find(a,b);
	System.out.println("GCD is :"+q);
}
private static int GCD_Find(int a , int b)
{
	if(a%b==0)
		return b;
	else
		return GCD_Find(b,a%b);
}
}


