class m10pattern
{
    public static void main()
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==1)
                System.out.print(i);
            }
            if(i%2==1)
            System.out.println();
        }
    }
}
