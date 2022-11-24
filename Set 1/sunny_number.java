import java.util.*;
class sunny_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=sc.nextInt();
        num=num+1;
        if(Math.sqrt(num)%1==0)
        System.out.println("It is a Sunny Number");
       else
       System.out.println("It is not a Sunny Number");
    }
}