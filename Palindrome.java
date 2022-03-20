package Strng;
import java.util.Scanner;
public class Palindrome {
	public static int CheckPalindrome()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string you want to check whether it is palindrome or not ");
		String str = s.next();
		int n = str.length();
		int i=0;
		int j=n-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return -1;
			}
			else
			{
				i++;
				j--;
			}
		}
		return 1;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("how many strings do you want to enter");
	int n = s.nextInt();
	for(int i=0;i<n;i++)
	{
		int result=CheckPalindrome();
		if(result==1)
			System.out.println("yes");
		else
			System.out.println("No");
		
	}
}
}
