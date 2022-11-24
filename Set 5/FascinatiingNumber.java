import java.util.*;
public class FascinatiingNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		sc.close();
		int numMul2=num*2;
		int numMul3=num*3;
		//Concatenating the Numbers.
		String result=String.valueOf(num)+String.valueOf(numMul2)+String.valueOf(numMul3);
		if(result.length()!=9)
		{
			System.out.println("It is not a Fascinating NUmebr");
		}
		else
		{
			//System.out.println(result);
			int comparison[]= {1,2,3,4,5,6,7,8,9};
			int arr[]=new int[result.length()];
			int c=0;
			for(int i=0;i<=arr.length-1;i++)
			{
				arr[i]=Integer.parseInt(String.valueOf(result.charAt(i)));
			}
			Arrays.sort(arr);
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[j]==comparison[j])
					c++;
			}
			if(c==9)
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
}
