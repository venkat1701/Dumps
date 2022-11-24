package Patterns;

public class Pattern57 {
	public static void main(String[] args)
	{
		System.out.println("Pyramid  54");
		for(char i='A';i<='E';i++)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		for(int i='D';i>=1;i--)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
	}
}

