package Practice;

public class RectangleNumber {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");
			for(int k=5;k>=i;k--)
			{
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
	}
}
