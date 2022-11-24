
class patt13
{
    public static void main()
    {
        String str="KRISH";
        for(int i=0;i<str.length();i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            System.out.print(str.charAt(i)+" ");
            for(int j=1;j<=i;j++)
            {
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}