import java.util.*;
public class UniqueNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int N=sc.nextInt();
		sc.close();
		String str=String.valueOf(N);
		int count=0,number,result=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			count=0;
			result++;
			number=Integer.parseInt(String.valueOf(str.charAt(i)));
			for(int j=0;j<=str.length()-1;j++)
			{
				if(Integer.parseInt(String.valueOf(str.charAt(j)))==number)
					count++;
				if(count>=2)
				{
					result--;
					break;
				}
			}
			
		}
		if(result==str.length())
			System.out.println("The Number is a Unique Number");
		else
			System.out.println("The Number is not a Unique Number");
	}
}
