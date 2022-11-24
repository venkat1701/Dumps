import java.util.*;
class Income
{
    private static double tax(int month_sal)
    {
        double  tax=0.0D;
        if(month_sal<=8000)
        tax=0.0;
        else if(month_sal>8000 && month_sal<=9000)
        tax=0.20*month_sal;
        else if(month_sal>9000 && month_sal<=10000)
        tax=0.30*month_sal;
        else
        tax=0.40*month_sal;
        return tax;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Monthly Salary");
        int month_sal=sc.nextInt();
        System.out.println("The Tax on your Salary = INR "+tax(month_sal));
        System.out.println("Deduced Salary = INR "+(month_sal-tax(month_sal)));
    }
}