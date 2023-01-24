package Strng;
import java.util.Scanner;
public class AllSubstrings {
	public static void checkSubstrings()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next();
		int n = str.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				System.out.print(str.substring(i,j));
				System.out.println();
			}
			//System.out.println();
		}
	}
public static void main(String[] args) {
	checkSubstrings();
}
}
