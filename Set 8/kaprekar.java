class kaprekar
{
    public static void main(int num)
    {
        int x=num;
        int count=0;
        while(x!=0)
        {
            count++;
            x/=10;
        }
        System.out.println(count);
        int sq=num*num;
        int rs=sq%(int)Math.pow(10,count);
        System.out.println("Rs: "+rs);
        int ls=sq/(int)Math.pow(10,count);
        System.out.println("Ls: "+ls);
        int comb=ls+rs;
        if(num==comb)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}