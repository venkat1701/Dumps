class PrimeFac
{
    public static void main(int num)
    {
        for(int i=2;i<=num;i++)
        {
            while(num%i==0)
            {
                num/=i;
                System.out.println(i);
            }
        }        
    }
}