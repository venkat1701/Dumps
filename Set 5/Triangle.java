import java.util.*;
class Triangle
{
    public static void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Three Sides of the Triangle");
        int fir=sc.nextInt();
        int sec=sc.nextInt();
        int thrd=sc.nextInt();
        if(((fir+sec)>thrd)&&((sec+thrd)>fir)&&((fir+thrd)>sec))
        {
            if((fir==sec && fir==thrd && sec==thrd))
            System.out.println("It is an Equilateral Triangle");
            else if((fir==sec)||(sec==thrd)||(fir==thrd))
            System.out.println("It is an Isosceles Triangle");
            else
            System.out.println("It is a Scalene Triangle");
        }
        else
        System.out.println("Triangle Not Possible");
    }
    public static void main()
    {
        Triangle trj=new Triangle();
        trj.accept();
    }
}