class patt6
{
    public static void main()
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(k=5;k>i;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}