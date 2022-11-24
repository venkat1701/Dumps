import java.util.*;
class Amicable2
{
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1=sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2=sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<=num1||i<=num2;i++)
        {
            if(num1%i==0)
            sum1+=i;
            if(num2%i==0)
            sum2+=i;            
        }
        if(sum1==sum2)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}