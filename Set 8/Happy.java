import java.util.*;
class Happy
{
    public static int isHappyNumber(int num)
    {
        int result=0,digit=0;
        while(num!=0)
        {
            digit=num%10;
            result+=digit*digit;
            num/=10;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int res;
        for(int i=1;i<=100;i++)
        {
            res=i;
            while((res!=1 && res!=4))
            {
                res=isHappyNumber(res);
            }
            if(res==1)
                System.out.println(i+" Happy Number");
            else
                System.out.println(i+" Not a Happy Number");
        }
    }
}