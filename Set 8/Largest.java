import java.io.*;
class Largest
{
    public static void main()throws IOException
    {
        int large=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Limit of Numbers that you will enter");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the First Number");
        int num=Integer.parseInt(br.readLine());
        large=num;
        if(n>=2)
        {
            for(int i=1;i<=(n-1);i++)
            {
                System.out.println("Enter the Number");
                int num1=Integer.parseInt(br.readLine());   
                if(large>num1)
                large=large;
                else
                large=num1;
            }
            System.out.println("Largest Number : "+large);
        }
        else
        System.out.println("Enter atleast 2 Numbers");
    }
}