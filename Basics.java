package Strng;
import java.util.Scanner;
public class Basics {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("What is the first name you want to enter");
	String str1= s.next();
	System.out.println("What is the second name you want to enter");
	String str2= s.next();
	System.out.println("Enter the character input");
	char ch = s.next().charAt(0);
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.concat(str2));
	System.out.println(str1.equals(str2));
	System.out.println(str1.substring(1,4));
	System.out.println(str2.substring(1,4));
	System.out.println(str2.charAt(4));
	System.out.println(str1.charAt(4));
	System.out.println(ch);
	
}
}
