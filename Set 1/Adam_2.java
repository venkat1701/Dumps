import java.util.Scanner;
class Adam_2
{
    static boolean isAdam(int number)
    {
        int n=number;
        int sq1=number*number;
        int digit=0,rev1=0,rev2=0;
        while(n!=0)
        {
            digit=n%10;
            rev1=rev1*10+digit;
            n/=10;
        }
        int sq2=rev1*rev1;
        while(sq2!=0)
        {
            digit=sq2%10;
            rev2=rev2*10+digit;
            sq2/=10;
        }
        if(rev2==sq1)
        return true;
        else
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println((isAdam(num))?"It is an Adam Number":"It is not an Adam Number");       
    }
}