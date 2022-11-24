import java.util.*;
class computer_Sales
{
    static double Commission(int num)
    {
        double comm=0.0D;
        if(num<=20000)
        comm=0.03*num;
        else if(num>20000 && num<=50000)
        comm=0.12*num;
        else
        comm=0.31*num;
        return comm;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sales Amount");
        int num=sc.nextInt();
        System.out.println("Your Commission as per the Criteria is = INR "+Commission(num));
    }
}