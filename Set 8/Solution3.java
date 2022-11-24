import java.util.*;
class Solution3 {
    public static Integer nthUglyNumber(int n) {
            List<Integer> list=new LinkedList<Integer>();
            for(int i=1,count=1;count<=n;i++)
            {
                 if(isUgly(i))
                 {
                    list.add(i);
                     count++;
                 }
            }
            return list.get(n-1);
        }
    public static boolean isUgly(int num)
    {
        while(num%2==0)num/=2;
        while(num%3==0)num/=3;
        while(num%5==0)num/=5;
        if(num==1)
            return true;
        else
            return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println("The nth Element is: "+nthUglyNumber(num));
    }
}