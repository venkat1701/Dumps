class m15pattern{
    public static void main()
    {
        for(int i=1;i<=7;i++)
        {
            for(int k=7;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(!(i%2==0))
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}