package Array;
import java.util.Scanner;
public class MaximumInArray {
	public static int[] Input()
	{
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int arr[]= new int [N];
		
		for(int i=0;i<N;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int Largest(int arr[])
	{
		int check = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>check)
			{
				check=arr[i];
				
			}
		}
		return check;
		
	}
public static void main(String[] args) {
		
		int array[]=Input();
		int maximum = Largest(array);
		System.out.println(maximum);
	}
}
