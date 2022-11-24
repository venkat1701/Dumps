import java.util.*;
public class LCM {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int hcf=0,lcm=0;
		//Just Calculating the HCF of a Number...
		for(int i=1;i<=a || i<=b;i++)
		{
			if(a%i==0 && b%i==0)
				hcf=i;
		}
		//LCM = (Product of 2 Numbers)/HCF.
		lcm=(a*b)/hcf;
		System.out.println("The LCM of 2 Numbers is : "+lcm);
		System.out.println("The HCF of 2 Numbers is : "+hcf);
	}
}
