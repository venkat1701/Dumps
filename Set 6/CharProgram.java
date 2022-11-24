import java.util.Scanner;
public class CharProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		int val=(int)ch;
		if(val>=65 && val<=90)
		{
			val-=64;
			System.out.println("The Positional Value is : "+val);
		}
		else if(val>=97 && val<=122)
		{
			val-=96;
			System.out.println("The Positional Value is : "+val);
		}
		else
			System.out.println("Not an Alphabet");
	}

}
