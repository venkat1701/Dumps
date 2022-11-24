class karprekar
{
    public static void main(int num)
    {
        int sq=num*num;
        int digit=Integer.toString(sq).length();
        int onepart=(int)(sq/Math.pow(10,digit/2));
        int twopart=(int)(sq%(int)Math.pow(10,digit/2));
        int sum=twopart+onepart;
        if(sum==num)
        System.out.println("Karprekar");
        else
        System.out.println("Not a Karprekar");
    }
}