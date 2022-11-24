import java.util.*;
public class PalindromicString {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		Palin(str);
	}
	public static void Palin(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		if(String.valueOf(sb.reverse()).equals(str))
			System.out.println("The String is Palindromic");
		else
			System.out.println("The String is not Palindromic");
	}
}
