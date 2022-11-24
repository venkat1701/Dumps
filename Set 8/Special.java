import java.util.*;
class Special
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int copy=num,digit=0,fact,sum=0;
        while(num!=0)
        {
            digit=num%10;
            fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        if(sum==copy)
        System.out.println("Special Number");
        else
        System.out.println("Not a Special Number");
    }
}