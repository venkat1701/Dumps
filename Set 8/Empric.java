class Empric
{
    static boolean isPrime(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            c++;
        }
        return (c==2)?true:false;
    }
    static int reverse(int num)
    {
        int digit=0,rev=0;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        return rev;
    }
    public static void main()
    {
        for(int i=1;i<=1000;i++)
        {
            if(isPrime(i) && isPrime(reverse(i)))
            System.out.print(i+" ");
        }
    }
}