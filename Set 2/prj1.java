import java.util.*;
class prj1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of the circle");
        int r=sc.nextInt();      
        double area=3.142*r*r;
        System.out.println("The Area of the Circle is: "+area);
    }
}