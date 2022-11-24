class m12pattern
{
    public static void main()
    {
        int c=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+c);
            }
            c++;
            System.out.println();
        }
    }
}
