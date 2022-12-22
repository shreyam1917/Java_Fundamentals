package Array;
import java.util.Scanner;
public class MergingArrays {
	public static int [] MergingBothArray(int arr1[] , int arr2[])
	{
		int m =arr1.length;
		int n =arr2.length;
		int i=0;
		int j=0;
		int k=0;
		int arr3[]= new int [m+n];
		while(i<m &&j<n)
		{
			if(arr1[i]<=arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<m)
		{
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m)
		{
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		return arr3;
	}
	public static void PrintArray(int arr[])
	{
		int n =arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
public static void main(String[] args) {
	int arr1[]= {1,3,5,7,9};
   	int arr2[]= {2,4,6,8,10};
   	int arr3[]= MergingBothArray(arr1,arr2);
   	PrintArray(arr3);
   	
}
}
