package Array;
import java.util.Scanner;
public class PairSum {
	public static void Check(int arr[],int C) {
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]== C )
					{
						count = count+1;
					}
				}
			}
		}
		System.out.println(count);
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N=s.nextInt();
	while(N>0)
	{
		int a = s.nextInt();
		int arr1[]= new int [a];
		for(int i=0;i<a;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter the number you want to check");
		int C = s.nextInt();
		Check(arr1,C);
	}
}
}
