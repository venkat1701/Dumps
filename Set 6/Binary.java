package Practice;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		sc.close();
		String result="";
		int digit=0;
		while(num!=0)
		{
			digit=num%2;
			result=Integer.toString(digit)+result;
			num/=2;
		}
		System.out.println("The Binary Equivalent: "+result);
	}
}
