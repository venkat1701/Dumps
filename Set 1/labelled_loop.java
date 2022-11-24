class labelled_loop
{
    public static void main()
    {
        outer:for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j*i);
                continue outer;

            }
            System.out.println();
        }
    }
}