class m7pattern
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                System.out.print("1");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                System.out.print("1");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}