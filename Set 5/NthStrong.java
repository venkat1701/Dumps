import java.util.*;
public class NthStrong {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of N under or equal to Constraints");
		int N=sc.nextInt();
		sc.close();
		int count=0,result=0;
		for(int i=1;;i++)
		{
			if(count==N)
				break;
			else
			{
				if(isStrong(i))
				{
					count++;
					result=i;
				}
			}
		}
		System.out.println("The : Nth Strong Number is : "+result);
	}
	public static boolean isStrong(int num)
	{
		int sum=0,copy=num;
		while(num!=0)
		{
			sum=sum+fact(num%10);
			num/=10;
		}
		if(sum==copy)
			return true;
		else
			return false;
	}
	public static int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
			fact*=i;
		return fact;
	}
}
