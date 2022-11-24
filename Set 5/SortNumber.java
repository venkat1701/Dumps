import java.util.*;
public class SortNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int result=0,dig=0,great=0,small=9;
		while(num!=0)
		{
			dig=num%10;
			great=Math.max(great, dig);
			small=Math.min(small,dig);
			System.out.println(Math.max(great, small));
			num/=10;
		}
		
	}
}
