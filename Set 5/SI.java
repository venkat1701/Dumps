import java.util.*;
class SI
{
    public void simpleInterest(int pr, double r, double t)
    {
        double sim_Int=(pr*r*t)/100.0;
        System.out.println("The Simple Interest is = "+sim_Int);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal, Rate and Time");
        int pr=sc.nextInt();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        SI s=new SI();
        s.simpleInterest(pr,r,t);
    }
}