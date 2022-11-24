import java.util.*;
class ascii2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Values");
        for(int i=1;i<=10;i++)
        {
            int ch=sc.nextInt();
            System.out.println(ch+" ---> "+(char)ch);
        }
    }
}