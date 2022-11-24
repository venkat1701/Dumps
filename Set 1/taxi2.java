/* Distance 1. 4   2.8    3. 12    4. 16
 * 1:) dis=4 ----> 100
 * 2:) dis=8 ----> 100+(8-5)*10---->130
 * 3:) dis=12 ----> 100+(12-5)*10----> 170
 * 4:) dis=16 ----> 100+(15*10)+(16-15)*8----> 258
 * 5:) dis=30 ----> 100+(15*10)+(15*8)+(30-25)*5 ----> 
 */


import java.util.Scanner;
class taxi2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Distance Travelled");
        int dis=sc.nextInt();
        int fare=0;
        if(dis<=5)
        fare=100;
        else if(dis>5 && dis<=15)
        fare=100+(dis-5)*10;
        else if(dis>15 && dis<=25)
        fare=100+(15*10)+(dis-15)*8;
        else
        fare=100+(15*10)+(15*8)+(dis-25)*5;
        System.out.println("The Fare is = "+fare);
    }
}