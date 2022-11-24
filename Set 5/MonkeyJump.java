import java.util.*;
public class MonkeyJump {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height of the building");
		int height=sc.nextInt();
		sc.close();
		int countJumps=0,monkey=5;
		for(int i=1;monkey<=height;i++)
		{
				monkey=monkey-((2/100)*monkey);
				monkey+=5;
				countJumps++;
		}
		System.out.println("The Number of Jumps = "+countJumps);
	}
}
