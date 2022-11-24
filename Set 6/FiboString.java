import java.util.*;
public class FiboString {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limit");
		int N=sc.nextInt();
		sc.close();
		String a="a",b="b",z="";
		System.out.print(a+","+b);
		for(int i=2;i<=N;i++)
		{
			z=b+a;
			System.out.print(","+z);
			a=b;
			b=z;
		}
	}
}
