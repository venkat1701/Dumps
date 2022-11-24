class happy
{
    private static int isHappy(int num)
    {
        int sum=0,digit=0;
        while(num!=0)
        {
            digit=num%10;
            sum=sum+digit*digit;
            num/=10;
        }
        return sum;
    }
    public static void main(int n)
    {
        int result=n;
        while(result!=1 && result!=4)
        {
            result=isHappy(result);
        }
        if(result==1)
        System.out.println("Happy Number");
        else
        System.out.println("UnHappy Number");
    }
}