/* b b b b 1
 * b b b 1 2
 * b b 1 2 3
 * b 1 2 3 4
 * 1 2 3 4 5
 * 
 */
class patt1
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}