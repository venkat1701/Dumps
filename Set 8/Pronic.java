import java.util.*;
class Pronic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        boolean isPronic=false;
        for(int i=1;i<=num;i++)
        {
            if(i*(i+1)==num)
            {
                isPronic=true;
                break;
            }
        }
        System.out.println((isPronic)?"It is Pronic Number":"It is not a Pronic Number");
    }
}