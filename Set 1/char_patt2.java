class char_patt2
{
    public static void main()
    {
        for(char ch1='A';ch1<='E';ch1++)
        {
            for(char ch2='A';ch2<=ch1;ch2++)
            {
                System.out.print(ch2+" ");
            }
            System.out.println();
        }
    }
}