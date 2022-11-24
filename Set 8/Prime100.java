class Prime100
{
    public static void main(String[] args)
    {
        System.out.println("1\n2\n3\n5\n7");
        for(int i=7;i<=100;i++)
        {
            if(i%2==0 || i%3==0 || i%5==0 ||i%7==0)
            continue;
            else
            System.out.println(i);
        }
    }
}