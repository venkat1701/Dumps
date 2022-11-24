import java.util.*;
class Basic_Salary
{
    static double allowances(int num)
    {
        double Tot_Sal;
        Tot_Sal=num+(0.15*num)+(0.15*num)+(0.10*num);
        return Tot_Sal;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println("The Total Salary inclusive of all Allowances = INR"+(allowances(num)));
    }   
}