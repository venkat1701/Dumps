class char_pascal
{
    public static void main()
    {
        char ch[]={' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int num=1;
        for(int i=1;i<=5;i++)
        {
            num=1;
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch[num]+" ");
                num=num*(i+j)/(j+1);
            }
            System.out.println();
        }
    }
}