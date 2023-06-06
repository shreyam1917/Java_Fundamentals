package fundamentals;
import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	
	int rev =0;
	for(int temp =N ; temp>0;)
	{
		int LastDigit = temp%10;
		rev = rev*10 + LastDigit;
		temp = temp/10;
	}
	System.out.println(rev);
}
}
