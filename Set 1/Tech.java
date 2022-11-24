import java.util.*;
class Tech
{
    static boolean isTech(int n)
    {
        int num=n;
        int c=Integer.toString(num).length();
        int left_Part=1,right_Part=1;
        if(c%2==0)
        {
            left_Part=num%(int)Math.pow(10,(c/2));
            right_Part=num/(int)Math.pow(10,(c/2));
        }
        int sum=(left_Part+right_Part)*(left_Part+right_Part);
        if(sum==num)
        return true;
        else
        return false;
    }
    public static void main(int number)
    {
        System.out.println(((isTech(number))==true)?"It is a Tech Number":"It is not a tech Number");
    }
}