class char_num
{
    public static void main()
    {
        char ch='A';
            for(int i=1;i<=10;i++)
            {
                ch='A';
                for(int j=1;j<=i;j++)
                {
                    if(i%2==0)
                    {
                       System.out.print(ch+" "); 
                    }
                    else
                    {
                        System.out.print(j+" ");
                    }
                    ch++;
                }
                System.out.println();
            }
    }
}