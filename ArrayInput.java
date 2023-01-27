package Array;
import java.util.Scanner;
public class ArrayInput {
	public static int[] Array()
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
		return arr;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	
	for(int i=1;i<=N;i++)
	{
		int array1[]=Array();
	}
	
}
}
