class adam
{
    public static void main(int num)
    {
        int sq_num=12*12,digit=0, rev=0, rev2=0;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        int sq_rev=rev*rev;
        while(sq_rev!=0)
        {
            digit=sq_rev%10;
            rev2=rev2*10+digit;
            sq_rev/=10;
        }
        if(rev2==sq_num)
        System.out.println("Adam Number");
        else
        System.out.println("Not Adam Number");
    }
}