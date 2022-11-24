import java.util.*;
class Automorphic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int copy=num,c=0,storeOrig=0,sqNum=num*num;
        while(copy!=0)
        {
            c++;
            copy/=10;
        }
        //Using the Same Concept to Extract Digits from the Square of the Number.
        storeOrig=sqNum%(int)Math.pow(10,c);
        if(storeOrig==num)
            System.out.println(num+" is an Automorphic Number");
        else
            System.out.println(num+" is not an Automorphic Number");
    }
}