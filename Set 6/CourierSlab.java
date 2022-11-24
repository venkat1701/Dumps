import java.util.*;
public class CourierSlab {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Weight in Kilograms");
		int weight=sc.nextInt();
		int charge=0;
		if(weight<=10)
		{
			charge=25*weight;
		}
		else if(weight>10 && weight<30)
			charge=(25*10)+((weight-10)*20);
		else
			charge=(25*10)+(20*20)+((weight-30)*10);
		System.out.println("Name \t \t Weight \t \tBill Amount");
		System.out.println("Product \t"+weight+"\t\t\t"+(charge+(charge*0.05)));
	}
}
