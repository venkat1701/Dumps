class m13pattern
{
    public static void main()
    {
        int a=0;
        for(int i=1;i<=5;i++)
        {
            a=1;
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a=a*(i-j)/j;
            }
            System.out.println();
        }
    }
}