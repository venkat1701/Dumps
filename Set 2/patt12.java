/*1
 *1 2           1
 *1 2 3          2 1
 *1 2 3 4           3 2 1
 *1 2 3 4 5         4 3 2 1
*/
class patt12
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            if(i>=2)
            {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
        }
            System.out.println();
        }
    }
}