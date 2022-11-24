import java.util.*;
class vedProgram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int digit=0,temp=num%10,c=0,count=0,copy=num;
        while(num!=0)
        {
            digit=num%10;
            if(digit==temp)
            {
                c++;
            }
            count++;
            num/=10;
        }
        if(copy>9 && c==count)
        System.out.println("It is the Same");
        else
        System.out.println("It is a Different Number");
    }
}