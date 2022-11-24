import java.util.*;
class Duck
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        boolean isDuck=false;
        int digit=0;
        while(num!=0)
        {
            digit=num%10;
            if(digit==0)
            {
                isDuck=true;
                break;
            }
            num/=10;
        }
        System.out.println((isDuck)?"It is Duck Number":"It is not a Duck Number");
    }
}