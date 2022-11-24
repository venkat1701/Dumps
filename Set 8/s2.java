class s2
{
    static int reverse(int num)
    {
        int dig=0,rev=0;
        while(num!=0)
        {
            dig=num%10;
            rev=rev*10+dig;
            num/=10;
        }
        return rev;
    }
    public static void main(int num)
    {
        int rev_num=reverse(num)*reverse(num);
        if(rev_num==(reverse(num*num)))
        System.out.println("IT IS ADAM");
        else
        System.out.println("IT IS NOT ADAM");
    }
}