class prime
{
    public static void main(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            c++;
        }
        if(c==2)
        System.out.println("Prime Number");
        else 
        System.out.println("Not a Prime Number");
    }
}