package Practice;

public class HalfDiamondPattern {
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=5;k>i;k--)
			{
				System.out.print("    ");
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}
