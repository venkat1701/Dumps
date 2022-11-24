import java.util.*;
class neon
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int sq=num*num;
        int digit=0, sum=0;
        while(sq!=0)
        {
            digit=sq%10;
            sum+=digit;
            sq/=10;
        }
        if(sum==num)
        System.out.println("Neon Number");
        else
        System.out.println("Not a Neon Number");
    }
}