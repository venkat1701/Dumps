import java.util.*;
class Odious_Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        String bin_num=Integer.toBinaryString(num);
        int binary=Integer.parseInt(bin_num);
        int digit=0,count=0;
        while(binary!=0)
        {
            digit=binary%10;
            if(digit==1)
            count++;
            binary/=10;
        }
        if(count%2==1)
        System.out.println("It is Odious Number");
        else 
        System.out.println("It is not an Odious Number");
    }
}