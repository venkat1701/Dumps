/*K
 *RR
 *III
 *SSSS
 *HHHHH
 */
class patkrish3
{
    public static void main()
    {
        int i=0,j=0;
        char[] ch={'K','R','I','S','H'};
        int len=ch.length;
        for(i=0;i<len;i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            System.out.print(ch[i]);
            for(int k=0;k<=i;k++)
            {
                System.out.print("  ");
            }
            System.out.println(ch[j]);
            j++;
        }
    }
}