import java.util.*;
class PalinPrime
{
    public boolean Palindrome(int num)
    {
        int digit=0,copy=num,rev=0;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if(rev==copy)
        return true;
        else 
        return false;
    }
    public boolean Prime(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        PalinPrime pp=new PalinPrime();
        System.out.println(((pp.Palindrome(n))&&(pp.Prime(n)))?"It is a PalinPrime Number":"It is not a PalinPrime Number");
    }
}