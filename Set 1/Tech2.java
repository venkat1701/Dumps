class Tech2
{
    static int tech_Num(int num)
    {
        int lp=0,rp=0,sum=0,c=0;
        c=Integer.toString(num).length();
        if(c%2==0)
        {
            lp=num%(int)Math.pow(10,c/2);
            rp=num/(int)Math.pow(10,c/2);
            sum=lp+rp;
            return (lp+rp)*(lp+rp);
        }
        else
        return 0;
    }
    public static void main(int n)
    {
        System.out.println((tech_Num(n)==n)?"It is a Tech Number":"It is not a Tech Number");
    }
}