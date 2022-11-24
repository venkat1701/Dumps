import java.util.*;
public class Cryptography {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be Encrypted");
		String str=sc.nextLine();
		System.out.println("Enter the Shift:");
		int shift=sc.nextInt();
		System.out.println("The Encoded Format is : "+encodeDecode(str,shift));
		System.out.println("The Original Reverse is : "+newstr(str));
	}
	public static String encodeDecode(String str,int shift)
	{
		String result="";
		String str2=str.toUpperCase();
		for(int i=0;i<=str2.length()-1;i++)
		{
			int ch=((int)str2.charAt(i)+shift);
			//CONVERTING OR WRAPPING UP THE TEXT.
			if(ch>90)
			{
				ch-=26;
			}
			if(ch<65)
			{
				ch+=26;
			}
			//CONVERTING OR WRAPPING UP THE TEXT.
			
			//ADDING THE RESULT.
			if(str2.charAt(i)==' ')
				result=result+" ";
			else
				result=result+(char)ch;
		}
		return result;
	}
	public static String newstr(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		return String.valueOf(sb.reverse());
	}
}
