/* 5
 * 45
 * 345
 * 2345
 * 12345
 */
class patt20
{
    public static void main()
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}