package Strng;
import java.util.Scanner;
public class ReverseString {
	public static void InputArray_Result()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = s.nextLine();
	    int n = str.length();
	    int p=n-1;
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(str.charAt(p--));
	    }
	    System.out.println();
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("how many strings do you want to enter");
	int n = s.nextInt();
	for(int i=0;i<n;i++)
	{
		InputArray_Result();
		
	}
}
}
