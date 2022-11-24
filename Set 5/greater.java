import java.util.*;
class greater
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Integer c=sc.nextInt();
        String str=(a>b && a>c)?"Value of A is Greater":(b>c)?"Value of B is Greater":"Value of C is Greater";
        System.out.println(str);
    }
}