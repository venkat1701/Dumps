import java.util.*;         //import java.util.Scanner;
class Scanner_demo
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.next();
        String sur_name=sc.next();
        System.out.println("First Name : "+name);
        System.out.println("Last Name : "+sur_name);
    }
}