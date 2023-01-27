package Array;
import java.util.Scanner;
public class Array_Input_Print {

public static int[] Input()
{
Scanner s=new Scanner(System.in);
int n = s.nextInt();
int arr[]=new int[n];

for(int i=0;i<n; i++)
{
	arr[i]=s.nextInt();
}
return arr;
}
public static void Print(int arrayInput[])
{
	int n=arrayInput.length;
	for(int i =0;i<n;i++)
	{
		System.out.print(arrayInput[i]);
	}
}
public static void main(String[] args) {
	int arrayreturned[]= Input();
	Print(arrayreturned);
}
}
