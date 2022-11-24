/* WAP to print Quad-Tri-Fibonacci
 */
class quadtri
{
    public static void main(int n)
    {
        int a=0,b=1,c=1,d,e=0;
        System.out.print(a+",");
        System.out.print(b+",");
        System.out.print(c);
        for(int i=1;i<n-3;i++)
        {
            d=a+b+c;
            System.out.print(","+d);
            a=b;
            b=c;
            c=d;
            e=a+b+c+d;
            System.out.print(","+e);
        }
    }
}