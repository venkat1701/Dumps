import java.util.*;
public class PairVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		sc.close();
		for(int i=0;i<=str.length()-2;i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				if(str.charAt(i+1)=='A' || str.charAt(i+1)=='E' || str.charAt(i+1)=='I' || str.charAt(i+1)=='O' || str.charAt(i+1)=='U')
				{
					System.out.println(str.charAt(i)+" "+str.charAt(i+1));
				}
			}
		}
	}
}
