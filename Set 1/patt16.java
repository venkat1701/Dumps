/* 54321
 * 5432
 * 543
 * 54
 * 5
 */
class patt16
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}