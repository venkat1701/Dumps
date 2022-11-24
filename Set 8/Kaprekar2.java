/* Kaprekar Number is a Number whose square when divided into two equal parts 
 * and added together equals to the Original Number.
 * Eg: 45 -> 2025 -> 20+25 -> 45
 */
import java.util.Scanner;
class Kaprekar2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int copy=num,c=0,leftNum=0,rightNum=0,sqNum=num*num;
        //Counting the Number of Digits in the Original Number.
        while(copy!=0)
        {
            c++;
            copy/=10;
        }
        //Finding the left-most part of the square of the number.
        /* Suppose Number is 45:
         * 45*45 = 2025 
         * So as to obtain 20(left-most part of number), we divide the square by 10^c which is 2 in this case.
         */
        leftNum=sqNum/(int)Math.pow(10,c);
        /* Now Suppose Number is 45:
         * 45*45 = 2025 
         * So as to obtain 25(right-most part of number), we find the modulus(%)of  the square by 10^c which is 2 in this case.
         */
        rightNum=sqNum%(int)Math.pow(10,c);
        //Finally we evaluate the condition according to the Question.
        if(leftNum+rightNum == num)
            System.out.println(num+" is a Kaprekar Number");
        else
            System.out.println(num+" is not a Kaprekar Number");
    }
}