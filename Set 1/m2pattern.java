class m2pattern
{
    public static void main()
    {
        int c=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+"\t");
                c++;
            }
            System.out.println();
        }
    }
}