class mathtest
{
    public static void main()
    {
        int a=-10, b=20;
        boolean value = ((Math.abs(a)+Math.abs(b))>=(Math.abs(b)+a));
        System.out.println(value);
    }
}