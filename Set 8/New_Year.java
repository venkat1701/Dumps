
import java.util.Scanner;
class New_Year
{
    public static final int SPACES=80;
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.nextLine();
        New_Year ny=new New_Year();
        ny.mountainsEvenSlope();
        displayName(name);
        System.out.println();
        ny.tree();
        System.out.println();
        ny.mountainsEvenSlope();
    }
    public void tree()
    {
        for(int i=1;i<=3;i++)
        {
            for(int k=8;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");                
            }
            
            //Right Tree
            for(int k=SPACES;k>=i*2;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");                
            }
            
            System.out.println();
        }
        
        for(int i=2;i<=8;i++)
        {
            for(int k=8;k>=i;k--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            
            //Right Tree
            for(int k=SPACES;k>=i*2;k--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        } 
        for(int i=1;i<=5;i++)
        {
            System.out.print("      ");
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            
            //Right Tree
            System.out.print("\t\t\t\t\t\t\t\t\t\t");
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }    
    public void mountainsEvenSlope()
    {
        for(int i=1;i<=5;i++)
        {
            for(int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==i || j==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            repeat(i);
            displayRepeat(i);
            System.out.println();
        }
    }
    static void repeat(int i)
    {
            for(int k=5;k>=i;k--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==i || j==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
    }
    static void displayRepeat(int k)
    {
        for(int i=1;i<=7;i++)
        {
            repeat(k);
        }
    }
    public static void displayName(String name)
    {
        System.out.println("\t\t\t\t     "+name);
        System.out.println("\t\t\t\t   "+"Wishes you and your Family");
        System.out.println("\t\t\t\t"+"A Happy and Prosperous New Year");
    }
}