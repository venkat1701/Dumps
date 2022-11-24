import java.util.*;
public class MulWithoutSign {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int num2=sc.nextInt();
		int temp=num2;
		long result=0L;
		for(int i=2;i<=num1;i++)
		{
			result=result+temp;
		}
		System.out.println("The Multiplicative Result is : "+result);
		sc.close();
	}
}
