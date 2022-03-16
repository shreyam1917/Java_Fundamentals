package fundamentals;
import java.util.Scanner;
public class NtoB_BtoN {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int N = s.nextInt();

for(int i=1; i<(N/2); i++)
{
	int r = i*i;
	if(r>N)
	{
		i=i-1;
		System.out.println(i);
		break;
	}
}
	}
}
