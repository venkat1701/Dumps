import java.util.*;
public class KboatCircleRadius
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Area of Circle: ");
        double area = in.nextDouble();
        double r = Math.sqrt(7 * area / 22);
        System.out.print("Radius of Circle = " + r);
    }
}