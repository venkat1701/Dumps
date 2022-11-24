import java.util.*;
public class ArithmeticOperations {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice");
		System.out.println("1 : Addition");
		System.out.println("2 : Substraction");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
		int choice=sc.nextInt();
		System.out.println("Enter the First Number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2=sc.nextInt();
		sc.close();
		switch(choice)
		{
			case 1:for(int i=1;i<=num2;i++)
				{
					num1++;
				}
				System.out.println("The Sum of 2 Numbers : "+num1);
				break;
			case 2:for(int i=1;i<=num2;i++)
				{
					num1--;
				}
				System.out.println("The Susbtraction of 2 Numbers : "+num2);
				break;
			case 3:long temp=num1,result=0L;
				if(num1==num2)
					System.out.println("The Multiplication of 2 Numbers : "+Math.pow(num1,2));
				else
				{
					for(int i=1;i<=num2;i++)
					{
						result=result+temp;
					}
					System.out.println("The Multiplication of 2 Numbers : "+result);
				}
				break;
			case 4:int divisor=Math.min(num2, num1);
					int dividend=Math.max(num1, num2);
					int quo=0;
					while(dividend>divisor)
					{
						dividend-=divisor;
						quo++;
					}
					System.out.println("The Quotient is : "+quo);
					System.out.println("The Remainder is : "+dividend);
					break;
		}
	}
}
