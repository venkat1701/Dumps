/*	K
      K R
    K R I
  K R I S
K R I S H
*/
class patkrish2
{
    public static void main()
    {
        char[] ch={'K','R','I','S','H'};
        int len=ch.length;
        for(int i=0;i<len;i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
    }
}