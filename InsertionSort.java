package Array;
import java.util.Scanner;
public class InsertionSort {
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
	public static void InsertionSorting(int Array[])
	{
		int n =Array.length;
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int temp=Array[i];
			while(j>=0&& Array[j]>temp)
			{
				Array[j+1]=Array[j];
				j--;
			}
		     Array[j+1]=temp;
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
			InsertionSorting(ArrayGiven);
			
		}
	}
}
