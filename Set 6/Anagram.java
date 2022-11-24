package Practice;
import java.util.*;
public class Anagram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Word ");
		String str1=sc.nextLine();
		System.out.println("Enter the Second Word ");
		String str2=sc.nextLine();
		sc.close();
		char ch[]=str1.toCharArray();
		Arrays.sort(ch);
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch2);
		int c=0;
		if(ch.length==ch2.length)
		{
			for(int i=0;i<=ch.length-1;i++)
			{
				if(ch[i]==ch2[i])
					c++;
			}
			if(c==ch.length)
				System.out.println("Strings are Anagram");
			else
				System.out.println("Strings are not Anagram");
		}
		else
			System.out.println("Strings are not Anagram");
	}
}
