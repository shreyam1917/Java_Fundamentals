package Strng;
import java.util.Scanner;
public class CheckPermutation {
	public static boolean PermutationCheck()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next();
		System.out.println("Enter the string");
		String str1 = s.next();
		int n = str.length();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(str.charAt(i)!=str1.charAt(j))
					return false;
				
				
			}
			
		}
		return true;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	boolean result=PermutationCheck();
	System.out.println(result);
}
}
