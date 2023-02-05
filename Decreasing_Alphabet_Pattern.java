package fundamentals;
import java.util.Scanner;
public class Decreasing_Alphabet_Pattern {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int i=N;
	while(i>0)
	{
		char p = (char)('A'+(i-1));
		int j=i;
		while(j<=N)
		{
			System.out.print(p);
			p= (char)(p+1);
			j=j+1;
		}
		System.out.println();
		i=i-1;
	}
	
}
}
