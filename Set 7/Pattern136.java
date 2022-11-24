package Patterns;

public class Pattern136 {

	public static void main(String[] args) {
		int spacing=4;
		for(int i=1;i<=5;i++)
		{
			spacing=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(spacing+" ");
				spacing=spacing+(5-j);
			}
			System.out.println();
		}
	}
}
