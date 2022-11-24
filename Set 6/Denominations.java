import java.util.*;
public class Denominations {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Denominations");
		int denom=sc.nextInt();
		//int copy=denom;
		//String result="";
		/*while(copy!=0)
		{
			result=inWords(copy%10)+" "+result;
			copy/=10;
		}
		System.out.println(result);*/
		Denomination(denom);
	}
	/*static String inWords(int n)
	{
		String str="";
		switch(n)
		{
		case 0:str="Zero";
		break;
		case 1:str="One";
		break;
		case 2:str="Two";
		break;
		case 3:str="Three";
		break;
		case 4:str="Four";
		break;
		case 5:str="Five";
		break;
		case 6:str="Six";
		break;
		case 7:str="Seven";
		break;
		case 8:str="Eight";
		break;
		case 9:str="Nine";
		break;
		default:str="";
		}
		return str;
	}*/
	static void Denomination(int num)
	{
		System.out.println("Denominations: ");
		int r1000,r500,r100,r50,r20,r10,r5,r2,r1;
		r1000=num/1000;
		num%=1000;
		r500=num/500;
		num%=500;
		r100=num/100;
		num%=100;
		r50=num/50;
		num%=50;
		r20=num/20;
		num%=20;
		r10=num/10;
		num%=10;
		r5=num/5;
		num%=5;
		r2=num/2;
		num%=2;
		r1=num;
		System.out.println("1000 x "+r1000+" = "+r1000*1000);
		System.out.println("500 x "+r500+" = "+r500*500);
		System.out.println("100  x :  "+r100);
		System.out.println("50   x :  "+r50);
		System.out.println("20   x :  "+r20);
		System.out.println("10   x :  "+r10);
		System.out.println("5    x :  "+r5);
		System.out.println("2    x :  "+r2);
		System.out.println("1    x :  "+r1);
	}
}
