import java.util.*;
class emrip2
{
    static boolean isPrime(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            c++;
            if(c>3 && c<=1)
            break;
        }
        if(c==2)
        return true;
        else
        return false;
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
        if(isPrime(rev) && isPrime(temp))
        System.out.println("It is a Emrip Number");
        else
        System.out.println("It is not an Emrip Number");      
    }
}
