class Multi_table_patt
{
    public static void main()
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                System.out.print(i*j+" ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}