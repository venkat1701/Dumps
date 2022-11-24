import java.util.*;
class menus1s2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 forPress 1 to print Sum of Series: (1/1^3) - (1/2^3) +(1/3^3) - .....(1/n^3)");
        System.out.println("Press 2 forPress 1 to print Sum of Series: 1+(1+3)+(1+3+5)+(1+3+5+7)+(1+3+5+7+....nth term)");
        System.out.println("Press 3 to Exit Program");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.println("Enter a Limit");
            int n=sc.nextInt();
            double sum=0.0D,sum1=0.0D;
            for(int i=1;i<=n;i++)
            {
                if(i%2!=0)
                    sum=sum+(1/Math.pow(i,3));
                else
                    sum1=sum1+(1/Math.pow(i,3));
            }
            System.out.print(sum1-sum+"\t"); 
            break;
            
            case 2:System.out.println("Enter a Limit");
            int n2=sc.nextInt();
            int sum2=0;
            for(int i=1;i<=n2;i++)
            {
                sum2=sum2+(i*i);
            }
            System.out.print(sum2);
            break;
            
            case 3:System.exit(0);
            break;
        }
    }
}