import java.util.*;
class Pattern101
{
    static void triSides(boolean reverse)
    {
        if(!reverse)
        {
            for(int i=3;i<=5;i++)
            {
                for(int k=4;k>=i;k--)
                System.out.print(" ");
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else
        {
            for(int i=5;i>=3;i--)
            {
                for(int k=4;k>=i;k--)
                System.out.print(" ");
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    static void rect(int noLines)
    {
        for(int i=1;i<=noLines-6;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Of Lines for The Pattern (More Than 8)");
        int noLines=sc.nextInt();
        triSides(false);
        rect(noLines);
        triSides(true);
    }
}