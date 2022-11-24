import java.util.*;
class Pronic_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int flag=0;
        for(int i=1;i<=num;i++)
        {
            if((i*(i+1))==num)
            {
                flag=1;
                break;
            }
        }
        System.out.println((flag==1)?"It is Pronic Number":"It is not a Pronic Number");
    }
}