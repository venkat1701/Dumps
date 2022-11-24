/* A
 * B C
 * D E F
 * G H I J
 * K L M N O
 */
class char_arry
{
    public static void main()
    {
        char ch='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}