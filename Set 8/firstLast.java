class firstLast
{
    public static void main(int num)
    {
        System.out.println("The Last Digit is = "+num%10);
        int first=0,copy=num;
        while(num!=0)
        {
            first++;
            num/=10;
        }
        int digit1=copy/(int)Math.pow(10,first-1);
        if(digit1==copy%10)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}