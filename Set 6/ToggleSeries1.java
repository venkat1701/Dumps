
public class ToggleSeries1 {
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=1;i<=15;i++)
		{
			if(i%2==0)
			{
				sum-=i;
			}
			else
				sum+=i;
		}
		System.out.print("The Sum of Series is = "+sum);
	}
}
