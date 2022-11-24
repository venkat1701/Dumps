class Disarium
{
    public static void main(int num)
    {
        int dig=0,copy,c=0,sum=0;
        for(copy=num;copy!=0;copy/=10)
        {
            c++;
        }
        copy=num;
        while(num!=0)
        {
            dig=num%10;
            sum=sum+(int)Math.pow(dig,c--);
            num/=10;
        }
        System.out.println((sum==copy)?"It is Disarium":"It is not Disarium");
    }
}