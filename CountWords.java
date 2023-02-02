package Strng;
import java.util.Scanner;
public class CountWords {
	public static int Count(String str)
	{
		int n = str.length();
		int counting=1;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)==' ')
			counting++;
		}
		return counting;
	}
	public static String InputArray()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = s.nextLine();
		return str;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("how many strings do you want to enter");
	int n = s.nextInt();
	for(int i=0;i<n;i++)
	{
		String str = InputArray();
		int a=Count(str);
		System.out.println(a);
	}
}
}
