import java.util.*;
public class ShortName {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		String result="";
		for(int i=0;i<=arr.length-1;i++)
		{
			String word=arr[i];
			if(i==arr.length-1)
			{
				result=result+word;
				break;
			}
			else
				result=result+word.charAt(0)+".";
		}
		System.out.println(result);
	}
}
