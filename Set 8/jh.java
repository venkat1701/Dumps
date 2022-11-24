class jh
{
    public static void main()
    {
        for(int m=5;m<=20;m+=5)
        {
            if(m%3==0)
            break;
            else
            if(m%5==0)
            System.out.println(m);
            continue;
        }
    }
}