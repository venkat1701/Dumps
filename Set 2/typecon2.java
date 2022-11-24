class typecon2
{
    public static void main()
    {   
        byte b1=1;
        short s1=2;
        int i1=3;
        long l1=4;
        float f1=5.2f;
        double d1=6.12d;
        boolean bo1=true;
        char ch1='A';
        double d2=(double)b1*s1/l1+f1-i1/ch1;
        System.out.println("The value of variable d2 is = "+d2);
    }
}