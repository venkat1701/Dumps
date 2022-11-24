import java.util.function.*;
public class series
{
    public static void main(int num) 
    {
        int digit=0,sum=0,pro=1;
        while(num!=0)
        {
            digit=num%10;
            sum+=digit;
            pro*=digit;
            num/=10;
        }
        if(sum==pro)
        System.out.println("It is a Spy Number");
        else
        System.out.println("It is not a Spy Number");
    }
}