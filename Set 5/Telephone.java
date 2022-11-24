import java.util.*;
class Telephone
{
    private static double Amount(int msgunit)
    {
        double amt=0.0D;
        if(msgunit<=80)
        amt=250.0;
        else if(msgunit>80 && msgunit<=140)
        amt=250+((msgunit-80)*0.60);
        else if(msgunit>140 && msgunit<=200)
        amt=250+(60*0.60)+((msgunit-140)*0.50);
        else
        amt=250+(60*0.60)+(60*0.50)+((msgunit-200)*0.40);
        return amt;        
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer Number");
        long cust=sc.nextLong();
        System.out.println("Enter the Message Units");
        int msgunit=sc.nextInt();
        System.out.println("Customer Number : "+cust);
        System.out.println("Message Units : "+msgunit);
        System.out.println("Amount : INR "+Amount(msgunit));
    }
}