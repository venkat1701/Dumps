class Multi_table2_patt
{
    public static void main()
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=9;j>=i;j--)
            {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}