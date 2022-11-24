class s5
{
    public static void main(int n)
    {
        double sum=0.0D;
        for(double i=1.0;i<=(double)n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.print(sum);
    }
}