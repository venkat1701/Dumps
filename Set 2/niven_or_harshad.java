import java.util.*;
class niven_or_harshad
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int sum=0, digit=0, copy=num;
        while(num!=0)
        {
            digit=num%10;
            sum+=digit;
            num/=10;
        }
        if(copy%sum==0)
        System.out.println("It is a Niven Number");
        else
        System.out.println("It is not a Niven Number");
    }
}