package Array;
import java.util.Scanner;
public class IntersectionOfTwoArrays {
public static void Check(int arr1[],int arr2[])
{
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr2.length;j++)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.print(arr1[i]+" ");
				arr2[j]=Integer.MIN_VALUE;
				break;
			}
		}
	}
	
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
		int b = s.nextInt();
		int arr2[]= new int [b];
		for(int i=0;i<b;i++)
		{
			arr2[i]=s.nextInt();
		}
		Check(arr1,arr2);
	}

}
}
