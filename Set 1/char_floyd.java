class char_floyd
{
    public static void main()
    {
        char ch3='A';
        for(int i=1;i<=5;i++)
        {
            for(int k=4;k>=i;k--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch3+" ");
                ch3++;
            }
            System.out.println();
        }
    }
}