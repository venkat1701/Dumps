import java.util.*;
class Sales
{
     public static double Commission(int num)
    {
        double comm=0.0D;
        if(num<=999)
        comm=0.01*num;
        else if(num>=1000 && num<=9999)
        comm=0.05*num;
        else
        comm=0.10*num;
        return comm;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount of Sales");
        int num=sc.nextInt();
        System.out.println("Sales Amount for : "+num+" is = INR: "+Commission(num));
        if(num!=0)          //Recursion Applied
        main();         //Calling main() method recursively.
    }
}