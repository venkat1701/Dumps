import java.util.*;
class sumoddeven
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int digit=0, c=0, sum_odd=0, sum_even=0;
        while(num!=0)
        {
            digit=num%10;
            c++;
            if(c%2==0)
            {
                sum_even=sum_even+digit;
            }
            else
            {
                sum_odd+=digit;
            }
            num/=10;
        }
        System.out.println("Sum of Odd Digits = "+sum_odd);
        System.out.println("Sum of Even Digits = "+sum_even);
    }
}