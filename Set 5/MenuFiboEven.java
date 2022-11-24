import java.util.*;
public class MenuFiboEven {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice");
		System.out.println("Enter 1. for Fibo Series");
		System.out.println("Enter 2. for Sum of Even Digits of a Number");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: int a=0,b=1;
			System.out.print(a+","+b);
			int c=0;
			for(int i=3;i<=25;i++)
			{
				c=a+b;
				if(c>25)
					break;
				System.out.print(","+c);
				a=b;
				b=c;
				
			}
			break;
		case 2: System.out.println("Enter the Number");
			int num=sc.nextInt();
			int sum=0;
			while(num!=0)
			{
				if(num%10%2==0)
				sum+=num%10;
				num/=10;
			}
			System.out.println("The Even Sum of Digits is = "+sum);
			break;
		default:System.out.println("The Choice is Wrong");
		}
		sc.close();
	}
}
