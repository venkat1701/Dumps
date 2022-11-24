import java.util.*;
class ascii
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Characters");
        for(int i=1;i<=10;i++)
        {
            char ch=sc.next().charAt(0);
            System.out.println(ch+" ---> "+(int)ch);
        }
    }
}