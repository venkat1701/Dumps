import java.util.*;
class LargeSmall
{
    public static void main(String[] args)
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=ss.nextInt();
        int great=0,small=9,dig=0;
        int result=0;
        while(num!=0)
        {
            dig=num%10;
            great=Math.max(dig,great);
            small=Math.min(dig,small);
            if(great<small)
                result=result*10+great;
            else
                result=result*10+small;
            num/=10;
        }
        System.out.println("The Largest Number is = "+great);
        System.out.println("The Smallest Number is = "+small);
        System.out.println("Sorted "+result);
    }
}