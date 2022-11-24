import java.util.*;
class Duck
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int digit=0,flag=0;
        while(n!=0)
        {
            digit=n%10;
            if(digit==0)
            flag++;
            n/=10;
        }
        System.out.println((flag>0)?"It is a Duck Number":"It is not a Duck Number");
    }
}