import java.util.*;
public class AcceptAndSortString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		sc.close();
		str=str.toLowerCase();
		String temp="";
		String result="";
		for(char ch='a';ch<='z';ch++)
		{
			temp=str;
			for(int i=0;i<=temp.length()-1;i++)
			{
				if(temp.charAt(i)==ch)
				{
					result=result+" "+temp.charAt(i);
				}
				temp=temp.substring(0,str.length());
			}
		}		
		System.out.print(result);
	}
}
