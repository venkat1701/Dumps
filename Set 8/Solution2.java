import java.util.*;
class Solution2 {
    public static int solve(int n) {
        if(n==1)
        return 1;
        else if(n==0)
        return 0;
        else
        {
            int temp=0,square=0,cube=0;
            for(int i=2;i<=n;i++)
            {
                if(Math.sqrt(i)%1==0)
                {
                    square=(int)Math.sqrt(i);
                }
                else if(Math.cbrt(i)%1==0)
                {
                    cube=(int)Math.cbrt(i);
                }
                else
                continue;
                temp=Math.max(square,cube);
            }
            return temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println(solve(num));
    }
}