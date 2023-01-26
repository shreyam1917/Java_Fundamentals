package Array;
import java.util.Scanner;
public class ArrangingNumbers {
	
	public static int[] Input(int n)
	{
   Scanner s=new Scanner(System.in);
//	int n = s.nextInt();
	int arr[]=new int[n];

	for(int i=0;i<n; i++)
	{
		arr[i]=s.nextInt();
	}
	return arr;
	}
	
	public static void PrintingArrangedNumbers(int arr[],int N)
	{
		
		int i=0;
		int j =N-1;
		int num=1;
		while(i<=j)
		{
			if(num%2!=0)
			{
				arr[i]=num;
				num++;
				i++;	
			}
			else
				{
				arr[j]=num;
				num++;
				j--;
				}	
		}
		for(int a =0;a<N;a++)
		{
			System.out.print(arr[a]);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int N = s.nextInt();
		int Input[]=Input(N);
		PrintingArrangedNumbers(Input,N);
	}

}
