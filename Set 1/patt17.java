class patt17
{
    public static void main()
    {
        int c=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(Integer.toBinaryString(i)+" ");
            }
            System.out.println();
        }
    }
}