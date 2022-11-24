package Practice;

public class DiamondA {
	public static void main(String[] args)
	{
		char ch='a';
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(ch+" ");
			System.out.println();
		}
		
		for(int i=4;i>=1;i--)
		{
			for(int k=5;k>i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(ch+" ");
			System.out.println();
		}
	}
}
