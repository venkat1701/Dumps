class series2
{
    public static void main(int n)
    {
        int reverse=0,digit,copy=n;
        while(n!=0)
        {
            digit=n%10;
            reverse=reverse*10+digit;
            n/=10;
        }
        int differ=Math.max(reverse,copy)-Math.min(reverse,copy);
        System.out.println("Absolute Difference: "+differ);
    }
}