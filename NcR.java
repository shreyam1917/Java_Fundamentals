package fundamentals;
import java.util.Scanner;
public class NcR {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int R = s.nextInt();
	int factN=1;
	int factR=1;
	int factNR=1;
	
	for(int i=1; i<=N; i++)
	{
		factN= factN*i;
	}
	for(int j=1; j<=R; j++)
	{
		factR= factR*j;
	}
	for(int k=1; k<=(N-R); k++)
	{
		factNR= factNR*k;
	}
	int result = factN/(factR*factNR);
	System.out.println(result);
}
}
 