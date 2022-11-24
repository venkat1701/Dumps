
import java.util.*;
public class AcceptAndSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three or more digited Number");
		int number=sc.nextInt();
		sc.close();
		int temp=number;
		//Iterating through the Number and checking the smallest to largest number.
		for(int i=0;i<=9;i++)
		{
			temp=number;
			while(temp>0)
			{
				if(temp%10==i)
					System.out.print(temp%10+" ");
				temp/=10;
			}
		}
	}
}
