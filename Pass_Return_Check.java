package Functions;
import java.util.Scanner;
public class Pass_Return_Check {
	public static void a(int num)
	{
		num+=2;
		b(num);
		System.out.println("Inside A  "+num);
	}
	public static void b(int num)
	{
		num+=3;
		c(num);
		System.out.println("Inside B  "+num);
	}
	public static void c(int num)
	{
		num+=4;
		System.out.println("Inside C  " +num);
	}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	a(N);
	System.out.println("Inside Main  "+N);
}
}
