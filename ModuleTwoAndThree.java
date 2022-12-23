package fundamentals;
import  java.util.Scanner;
public class ModuleTwoAndThree {
public static void main(String[] args) {
	/*
	 * int a,b,c; Scanner s = new Scanner(System.in);
	 * System.out.println("What is you name :"); String str = s.nextLine();
	 * System.out.println("Hello" + str + " Welcome to average calculator: ");
	 * System.out.println("Enter your marks below as instructed :\n");
	 * System.out.println("Enter your marks scored in mathamatics :"); a =
	 * s.nextInt(); System.out.println("Enter your marks scored in Science"); b =
	 * s.nextInt(); c = (a + b)/2;
	 * System.out.println("The average of your marks are :" + c);
	 */
	
Scanner s = new Scanner(System.in);
String name = s.next();
char ch = name.charAt(0);
	char sd = name.charAt(6);
	System.out.println(ch);
	
//	byte min = Byte.MIN_VALUE;
//	byte max = Byte.MAX_VALUE;
//	System.out.println(min + " " +max);
	
//	 int var1 = 5; 
//     int var2 = 6;
//     if ((var2 = 1) == var1)
//         System.out.print(var2);
//     else 
//         System.out.print(var2 + 1);
}
}
