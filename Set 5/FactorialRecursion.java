import java.io.*;
public class FactorialRecursion {
	public static int fact(int num)
	{
		if(num==1)
		{
			return 1;
		}
		return (num*fact(num-1));
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number");
		int num=Integer.parseInt(br.readLine());
		System.out.println("The Factorial is : "+fact(num));
	}
}
