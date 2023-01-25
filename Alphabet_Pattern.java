
package fundamentals;
import java.util.Scanner;

public class Alphabet_Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int i=1;
		while(i<=N)
		{
			int m=1;
			while(m<=i)
			{
			int j=i;
			while(j<=i)
			{
				char jth = (char)('A'+ (j-1));
				System.out.print(jth);
				char jth = (char)(jth +1);
				j=j+1;
			}
			m=m+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}

