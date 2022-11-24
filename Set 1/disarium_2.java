import java.util.Scanner;
class disarium_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int dis_num=sc.nextInt();
        int digit=0,sum=0,c=Integer.toString(dis_num).length();
        int copy=dis_num;
        while(dis_num!=0)
        {
            digit=dis_num%10;
            sum+=(int)Math.pow(digit,c--);
            dis_num/=10;
        }
        System.out.println((copy==sum)?"It is Disarium Number":"It is not a Disarium Number");
    }
}