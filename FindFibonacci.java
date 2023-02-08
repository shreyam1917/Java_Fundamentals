package Functions;
import java.util.Scanner;
public class FindFibonacci {

	public static boolean checkMember(int n){
        int a=0;
        int b=1;
        if(n==0)
        {
            return true;
        }
        while((a+b)<=n)
        {
        int temp=a+b;
         a=b;
         b=temp;
         
         if(n==temp )
         {
             return true;
         }
        }
	return false;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		checkMember(N);
	}
}
