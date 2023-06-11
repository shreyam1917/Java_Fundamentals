package fundamentals;
import java.util.Scanner;


public class Square_Pattern {
	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of asterics you want in a square");
        N = s.nextInt();
        int i =1;

        while(i <= N )
        {
            int j =i;
        	while(j<=i && j>0)
        	{
        		System.out.print(j);
        		j=j-1;
        	}
        	System.out.println();
        	i=i+1;
        }
	}

}
