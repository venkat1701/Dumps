import java.util.*;
public class SortUsingArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		sc.close();
		int count=0,temp=0;
		int result[]=new int[Integer.toString(number).length()];
		for(int i=0;i<=9;i++)
		{
			temp=number;
			while(temp!=0)
			{
				if(temp%10==i)
				{
					result[count]=temp%10;
					count++;
				}
				temp/=10;
			}
		}
		for(int i=0;i<=result.length-1;i++)
		{
			System.out.print(result[i]+" , ");
		}
	}
}
