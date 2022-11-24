class ca4
{
    public static void main(int n)
    {
        double d=0.0D;
        double a=0;
        for(double j=1.0;j<=n;j++)
        {
                a=j+j+1.0;
                d+=(j+a+1)/(j*(a+1));
        }
        System.out.println("Sum = "+d);
    }
}