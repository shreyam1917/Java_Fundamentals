package Array;
import java.util.Scanner;
public class LinearSearch {
	public static int[] Input()
	{
	System.out.println("Enter how many numbers you want to enter");
	Scanner s=new Scanner(System.in);
	int n = s.nextInt();
	int arr[]=new int[n];

	for(int i=0;i<n; i++)
	{
		arr[i]=s.nextInt();
	}
	return arr;
	}
	public static int Search(int arrayInput[],int num)
	{
		int n=arrayInput.length;
		int check=num;
		for(int i =0;i<n;i++)
		{
			if(arrayInput[i]==check)
			{
				return i;
			}
//			else
//				System.out.println("-1");
		}
		return -1;
	}
	public static void main(String[] args) {
		int arrayinput[]=Input();
		System.out.println("Enter the number you want to search");
		Scanner s =new Scanner(System.in);
		int N=s.nextInt();
		int result=Search(arrayinput,N);
		if(result==-1)
			System.out.println("-1");
		else
			System.out.println(result);
	}
}
