import java.util.*;
public class NthArmstrong {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Nth Number");
		int number=sc.nextInt();
		int result=0;
		number-=2;
		for(int i=1,count=0;count<=number;i++)
		{
			if(isArmstrong(i) ||i==0 || i==1)
			{
				result=i;
				count++;
			}
		}
		System.out.println("The : "+(number+2)+"th Armstrong Number is = : "+result);
		sc.close();
	}
	public static boolean isArmstrong(int number)
	{
			int digit=0,sum=0,copy=number;
			while(number!=0)
			{
				digit=number%10;
				sum+=(digit*digit*digit);
				number/=10;
			}
			if(copy==sum)
				return true;
			else
				return false;
	}
}
