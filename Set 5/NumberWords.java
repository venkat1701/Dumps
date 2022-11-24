import java.util.*;
public class NumberWords {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		String result="",str="";
		while(num!=0)
		{
			
			switch(num%10)
			{
				case 0:str="Zero ";
				break;
				case 1:str="One ";
				break;
				case 2:str="Two ";
				break;
				case 3:str="Three ";
				break;
				case 4:str="Four ";
				break;
				case 5:str="Five ";
				break;
				case 6:str="Six ";
				break;
				case 7:str="Seven ";
				break;
				case 8:str="Eight ";
				break;
				case 9:str="Nine ";
				break;
			}
			result=str+result;
			num/=10;
		}
		System.out.println("The Result is : "+result);
	}
}
