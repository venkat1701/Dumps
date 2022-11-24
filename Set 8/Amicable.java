import java.util.*;
class Amicable
{
    static int factors(int num)
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1=sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2=sc.nextInt();
        if(factors(num1)==factors(num2))
        System.out.println("The Numbers are Amicable");
        else
        System.out.println("The Numbers are not Amicable");
    }
}