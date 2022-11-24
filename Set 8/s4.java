class s4
{
    public static void main(int n)
    {
        double sum=0.0D,sum2=0.0D;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+(1/Math.pow(i,3));
            }
            else
            {
                sum2=sum2+(1/Math.pow(i,3));
            }
            System.out.print(sum2-sum+"\t");
        }
    }
}