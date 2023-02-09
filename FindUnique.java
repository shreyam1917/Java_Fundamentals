package Array;
import java.util.Scanner;
public class FindUnique {
	public static int[] Input(int n)
	{
   Scanner s=new Scanner(System.in);
	int arr[]=new int[n];

	for(int i=0;i<n; i++)
	{
		arr[i]=s.nextInt();
	}
	return arr;
	}
	
	public static int FindingUnique(int arr[])
	{
	    for (int i = 0; i < arr.length; i++) {
	      int count = 0;
	  
	      for (int j = 0; j < arr.length; j++) {
	        if (arr[i] == arr[j]) {
	          count++;
	        }
	      }
	      if (count == 2) {
	        return arr[i];
	      }
	    }
	    return -1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int N = s.nextInt();
		int Input[]=Input(N);
		int result =FindingUnique(Input);
		System.out.println(result);
	}
}
