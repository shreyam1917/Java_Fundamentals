package Oops;
import java.util.Scanner;
public class GetterSetter {
public static void main(String[] args) {
//	Student s = new Student();
//    Scanner s2 = new Scanner(System.in);
//    System.out.println("Enter the roll number");
//    int n = s2.nextInt();
//    s.setRollnumber(n);
//    s.name="shreyam";
//    System.out.println(s.name + s.getrollNumber());
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter you name");
	String a = s1.nextLine();
	System.out.println("Enter your Roll Number");
	int b = s1.nextInt();
	Constructors s = new Constructors(a,b);
	System.out.println(s.name+" "+s.getRollNumber());
}
}
