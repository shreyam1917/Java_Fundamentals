package Array;
import java.util.Scanner;
public class SelectionSort {
	public static int[] ArrayInput()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter how many numbers do you want to enter");
		int a = s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("Element at index number "+i +" should be");
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void Sorting(int Array[])
	{
		int n =Array.length;
		for(int i=0;i<n-1;i++)
		{
			int min=Integer.MAX_VALUE;
			int minIndex=-1;
			for(int j=i;j<n;j++)
			{
				if(Array[j]<min)
				{
					min=Array[j];
					minIndex=j;
				}
			}
			int temp = Array[minIndex];
			Array[minIndex]=Array[i];
			Array[i]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(Array[i]);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many arrays do you want to check");
		int N = s.nextInt();
		for(int i=1;i<=N;i++)
		{
			int ArrayGiven[]=ArrayInput();
			Sorting(ArrayGiven);
			
		}
	}
}
