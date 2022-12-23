package fundamentals;
import java.util.Scanner;
public class Mirror_Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n)
		{
			int p=1;
			int spaces =1;
			while(spaces<=(n-i))
			{
				System.out.print(' ');
				spaces= spaces+1;
			}
			int stars =i;
			while(stars<=i)
			{
				System.out.print(p);
				p=p+1;
				stars=stars+1;
			}
			int dec = i -1;
			while(dec>=i)
			{
				System.out.print(dec);
				dec= dec-1;
			}
			System.out.println();
			i=i+1;
		}
	}

}
