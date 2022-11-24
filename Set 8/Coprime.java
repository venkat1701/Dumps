import java.util.Scanner;
public class Coprime
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j%2);
            }
            System.out.println();
        }
    }
}