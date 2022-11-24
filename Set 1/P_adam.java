import java.util.*;
class P_adam
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        Adam_2 ad2=new Adam_2();
        ad2.isAdam(n);
        if(ad2.isAdam(n)==true)
        {
            int c=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            System.out.println((c==2)?"It is a Prime-Adam Number":"It is only an Adam Number");
        }
        else
        System.out.println("It is not an Adam Number");
    }
}