import java.io.*;
public class NthArmstrong {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Nth Term");
		int num=Integer.parseInt(br.readLine());
		int result=0;
		for(int count=1,i=1;;i++)
		{
			if(isArmstrong(i))
			{
				result=i;
				count++;
			}
			if(count==num)
			{
				break;
			}
		}
		System.out.println("The Result is : "+result);
	}
	private static boolean isArmstrong(int num)
	{
		int copy=num,sumCube=0;
		while(num!=0)
		{
			sumCube=sumCube+((int)Math.pow(num%10,3));
			num/=10;
		}
		if(copy==sumCube)
		return true;
		else
			return false;
	}
}
