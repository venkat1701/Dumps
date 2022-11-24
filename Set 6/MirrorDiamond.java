package Practice;

public class MirrorDiamond {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			if(i>=2)
			{
				for(int sec=i-1;sec>=1;sec--)
				{
					System.out.print(sec+" ");
				}
			}
			System.out.println();
		}
	}
}
