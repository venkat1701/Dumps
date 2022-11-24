class three
{
    public static void main(int num)
    {
        int dig1, dig2=0,sum=0,rev=0;
        dig1= num%10;
        sum+=dig1;
        rev=rev*10+dig1;
        num/=10;
        dig1=num%10;
        sum+=dig1;
        rev=rev*10+dig1;
        num/=10;
        dig1=num%10;
        sum+=dig1;
        rev=rev*10+dig1;
        System.out.println(sum);
        System.out.println(rev);
    }
}