import java.util.*;
class emrip
{
    static boolean isPrime(int num)
    {
        if(num%2==0 || num%3==0 || num%5==0 || num%7==0 && num>9)
        {
            return false;
        }
        else
        return true;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int digit=0,rev=0,temp=num;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if(isPrime(rev) && isPrime(temp) && !(temp==rev))
        System.out.println("It is a Emrip Number");
        else
        System.out.println("It is not an Emrip Number");      
    }
}
