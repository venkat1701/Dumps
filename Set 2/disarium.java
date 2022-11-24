class disarium
{
    public static void main(int n)
    {
        int digit=0, c=0,copy=n;
        double sum=0.0D;
        c=Integer.toString(n).length();
        while(n!=0)
        {
            digit=n%10;
            sum=sum+Math.pow(digit, c--);
            n/=10;
        }
        if(sum==copy)
        System.out.println("It is a Disarium Number");
        else
        System.out.println("It is not a Disarium Number");
    }
}