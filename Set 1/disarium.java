import java.util.*;
class disarium
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Digits of the Number");
        int n=sc.nextInt();
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int digit=0,copy=num;
        double sum=0.0D;        
        while(num!=0)
        {
            digit=num%10;
            sum=sum+Math.pow(digit, n--);
            num/=10;
        }
        if(sum==copy)
        System.out.println("It is a Disarium Number");
        else
        System.out.println("It is not a Disarium Number");
    }
}