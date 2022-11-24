class binary
{
    private static int BinarytoDecimal(int num)
    {
        int n=num;
        int base=1, last_num=0, decimal=0;
        while(n!=0)
        {
            last_num=n%10;
            decimal+=last_num*base;
            base=base*2;
            n/=10;
        }
        return decimal;
    }
    public static void main(int bin)
    {
        System.out.println("Binary to decimal conversion ="+binary.BinarytoDecimal(bin));
    }
}