import java.util.*;
class palindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        int digit=0,copy=num,rev=0;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        boolean b=(rev==copy)?true:false;
        System.out.println("Condition of Palindrome Number: "+b);
    }
}