import java.util.*;
class Automorphic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sq=n*n;
        int c=Integer.toString(n).length();
        int lastDgts=sq%(int)Math.pow(10,c);
        System.out.println((n==lastDgts)?"It is an Automorphic Number":"It is not an Automorphic Number");
    }
}        