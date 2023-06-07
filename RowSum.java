package t2Darray;
import java.util.Scanner;
public class RowSum {
	public static void InputArray()
	{
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int arr[][]=new int [rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int a=0;a<rows;a++)
		{
			int sum=0;
			for(int b=0;b<cols;b++)
			{
				sum=sum+arr[a][b];
			}
			System.out.print(sum+" ");
		}
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	for(int i=0;i<n;i++)
	{
		InputArray();
	}
}
}
