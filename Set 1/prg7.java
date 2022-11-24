class prg7
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int l=1;l<=i;l++)
            {              
                System.out.print(l);
            }
            System.out.println();
        }
        
    }
}