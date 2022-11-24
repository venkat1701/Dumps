import java.util.*;
class Smith
{
    public static int sumNum(int copy)
    {
        int digit=0,sum=0;
        while(copy!=0)
        {
            digit=copy%10;
            sum+=digit;
            copy/=10;
        }
        return sum;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sumFact=0,copy2=num;
        for(int i=2;i<=num;i++)
        {
            while(num%i==0)
            {
                num/=i;
                sumFact=sumFact+sumNum(i);
            }
        }        
        if(sumNum(copy2)==sumFact)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}