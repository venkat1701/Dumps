/* First 5 Days = 40 P / days
 * Next 5 Days = 65P / days
 * Above that = 80P / days
 * EG: Days=12
 * Charge = INR (5 * 40)+(12-5)*65 = INR 6.55
 */
import java.util.*;
class Library
{
    static double chargeCalculation(int num)
    {
        double charge=0.0D;
        if(num<=5)
        charge=num*40;
        else if(num>5 && num<=10)
        charge=(5*40)+((num-5)*65);
        else
        charge=(5*40)+(5*65)+((num-10)*80);
        charge=charge/100;
        return charge;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Late Days");
        int num=sc.nextInt();
        System.out.println("You are Late by : "+num+" days and you have to pay INR "+chargeCalculation(num));
    }
}