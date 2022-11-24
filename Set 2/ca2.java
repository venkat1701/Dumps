import java.util.*;
class ca2
{
    public static void main()
    {
        double n=0.0D;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to get the sum of series");
        System.out.println("Enter 2 to get the fibonacci series");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter a limit");
            n=sc.nextDouble();
            System.out.println("Enter the value of a");
            double a=sc.nextDouble();
            double sumser=0.0D;
            for(double i=1.0;i<=n;i++)
            {
                if(i%2.0==0.0)
                sumser=sumser-a/i;
                else
                sumser=sumser+a/i;
            }
            System.out.println("Sum of Series = "+sumser);
            break;
            case 2: System.out.print("Enter the limit for Fibonacci series");
            n=sc.nextDouble();
            int n1=0,n2=1;
            System.out.print(n1+"\t"+n2);
            int n3;
            for(int j=1;j<=n-2;j++)
            {
                n3=n1+n2;
                System.out.print("\t"+n3);
                n1=n2;
                n2=n3;                
            }
            break;
            default:System.out.println("No choice Made");
        }
    }
}