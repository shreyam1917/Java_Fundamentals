package Array;
import java.util.Scanner;
public class BinarySearch {
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
	public static int Search(int arr[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want to search int he array list");
		int C = s.nextInt();
		int Start=0;
		int End =arr.length-1;
		while(Start<=End)
		{
			int Mid=(Start+End)/2;
			if(arr[Mid]==C)
				return Mid;
			else if(arr[Mid]>C)
				End=Mid-1;
			else
				Start=Mid+1;
		}
		return -1;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter how many arrays do you want to check");
	int N = s.nextInt();
	for(int i=1;i<=N;i++)
	{
		int ArrayGiven[]=ArrayInput();
		int result = Search(ArrayGiven);
		System.out.println("The number you search is in the index number "+result);
	}
}
}
