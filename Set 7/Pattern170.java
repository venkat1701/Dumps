package Patterns;

public class Pattern170 {
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--)
		{
			for(int k=5;k>i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print((char)(64+i)+" ");
				}
				else
				{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}
