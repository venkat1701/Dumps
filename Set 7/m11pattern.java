class m11pattern
{
    static void RevPat()
    {
        for(int i=5;i>=1;i--)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();            
        }
    }
    static void StrtPat()
    {
        for(int i=2;i<=5;i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        m11pattern m11=new m11pattern();
        m11.RevPat();
        m11.StrtPat();
    }
}