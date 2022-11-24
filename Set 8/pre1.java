class pre1
{
    public static void main()
    {
        long y=838383,n=y,p,s;
        while(n>0)
        {
            p=n%10;
            System.out.println(Math.pow(p,2));
            n/=100;
        }
        System.out.println(y);
    }
}