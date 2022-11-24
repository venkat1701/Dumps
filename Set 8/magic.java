import java.util.*;
class magic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int num=sc.nextInt();
        /* Magic Number is a number which is obtained by the recursive sum of its digits until a single digit 
         * is obtained and then if the single digit is 1 then it is a magic number.
         * 199 -> 1+9+9 -> 1+9 -> 1+0 -> 1 .Hence it is a Magic Number
         */
        int copy=num,digit=0,sum=0;
        while(num!=0 || sum>9)
        {
            //If number becomes Zero then we will again run the loop assiging the value of sum into num.
            /* Eg: 199 -> 1+9+9 = 19
             * Now we need to assign the value of 19 to the original number.
             * 19 -> 1+9 = 10
             * Again we will assign the sum into original number.
             * 10 -> 1+0 = 1
             * Hence the end product is 1.So it is a Magic Number.
             */
            if(num==0)
            {
                num=sum;
                sum=0;
            }
            digit=num%10;
            sum=sum+digit;
            num/=10;
        }
        if(sum==1)
            System.out.println("It is a Magic Number");
        else
            System.out.println("It is not a Magic Number");
    }
}