import java.util.*;
public class MonkeyJump {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height of the building");
		double height=sc.nextDouble();
		double countJumps=1,monkeyHeight=5;
		for(double i=1.0;i<=height;)
		{
			countJumps++;
			if(i>1.0)
			{
				monkeyHeight=monkeyHeight-(monkeyHeight*0.2);
				i=monkeyHeight;
			}
		}
		System.out.println("The Number of Jumps = "+countJumps);
	}
}
