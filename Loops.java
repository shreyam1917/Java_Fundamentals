package fundamentals;
import java.util.Scanner;

public class Loops {
public static void main(String[] args) {
//	int i = 1;
//	System.out.println("How many times do you want to print statement :");
//	Scanner s = new Scanner(System.in);
//	int n = s.nextInt();
// while(i<=n)
//	{
//		System.out.println("Hello Shreyam , You succesfully ran a looping program");
//		i++;
//	}
	
	
//	int i=0;
//	   while(i<10)
//	   {
//	       i=i+1;
//	       System.out.print(i);
//	       i=i+1;
//	   }
	
	
//	 int x=5;
//	    int y=5;
//	    while((x=5)==y)
//	    {
//	        System.out.println("Hello");
//	        x++;
//	        y++;
//	    }
	
//	Scanner s = new Scanner (System.in);
//	int base = s.nextInt();
//	//System.out.println("What is your salary grade . Please mention in upper case :");
//	char c = s.next().charAt(0);
//
//	if (c==65)
//	{
//		int TotalSalary = base + ((base*20)/100) + ((base * 50)/100) + 1700 - ((base * 11)/100);
//		System.out.println(TotalSalary);
//	}
//	if (c==66)
//	{
//		int TotalSalary = base + ((base*20)/100) + ((base * 50)/100) + 1500 - ((base * 11)/100);
//		System.out.println(TotalSalary);
//	}
//	else if (c > 66)
//	{
//		int TotalSalary = base + ((base*20)/100) + ((base * 50)/100) + 1300 - ((base * 11)/100);
//		System.out.println(TotalSalary);
//	}
	
//	Scanner s = new Scanner (System.in);
//	int base = s.nextInt();
//	//System.out.println("What is your salary grade . Please mention in upper case :");
//	String str = s.next();
//	char c = str.charAt(0);
//	int allow;
//
//	if (c==65)
//	{
//		 allow = 1700;
//	}
//	 else if (c==66)
//	{
//        allow = 1500;
//	}
//	else 
//	{
//	    allow = 1300;	
//	}
//		double TotalSalary =( base + ((base*20)/100) + ((base * 50)/100) + allow - ((base * 11)/100));
//		double round = Math.round(TotalSalary);
//		int TS = (int)(round);
//		System.out.println(TS);
	
//	double allow = 0 ;
//	Scanner s = new Scanner(System.in);
//	int basic  = s.nextInt();
//	char c = s.next().charAt(0);
//
//
//
//	if(c==65)
//	{
//	  allow = 1700;
//	}
//	if(c==66)
//	{
//	  allow = 1500;
//	}
//	 else if(c > 66)
//	{
//	  allow = 1300;
//	}
//
//	double TotalSalary= basic +basic/2.0 + basic/5.0 + allow - ((11/100)*basic) ;
//	double v = (int) TotalSalary;
//
//	if(TotalSalary - v > 0.5)
//	{
//		TotalSalary = v + 1;
//	}
//	else
//	{
//	    TotalSalary = v;
//	}
//
//	   System.out.print(TotalSalary);

	  int i = 1;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while(i<= 10)
		{
		System.out.println(i*n);
		i = i + 1;
		}
	}
}

