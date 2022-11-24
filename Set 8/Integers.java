import java.util.Scanner;
public class Integers{
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        int pSum =0, pCount =0, nSum =0, nCount =0;
        System.out.println("Enter 50 numbers");
        for(int i =1; i <=50; i++){int n =in.nextInt();
            if(n >=0) {pSum +=n;pCount++;}
            else{nSum +=n;nCount++;
            }
        }
            System.out.println("Positive Count = "+pCount);
            System.out.println("Positive Sum = "+pSum);
            System.out.println("Negative Count = "+nCount);
            System.out.println("Negative Sum = "+nSum);}}