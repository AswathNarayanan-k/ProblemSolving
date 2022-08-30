package aaaaaa;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				int N = s.nextInt();
				int sum = 0;
				int a;
				int Temp = N;
				while(N>0)
				{
					a=N%10;
					sum = sum+a*a*a;	
					N=N/10;
				}
				System.out.println(sum);
				if(Temp == sum)
				{
					System.out.println("Its a Armstrong Number");
				}
				else
				{
					System.out.println("Its not a Armstrong Number");
				}
	}
	

}
