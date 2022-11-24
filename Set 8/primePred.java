import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Scanner;
class primePred
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Fibonacci Terms");
        int range=sc.nextInt();
        fibonacci.apply(range);
    }
    static Function<Integer,Integer> fibonacci=n ->{
       Integer fibo=0,a=0,b=1;
       for(Integer i=1;i<=n;i++) {
           fibo = a + b;
           Predicate<Integer> isPrime = val ->
           {
               int count = 0;
               for (Integer j = 1; j <= val; j++) {
                   if (val % j == 0)
                       count++;
               }
               return count == 2;
           };
           if (isPrime.test(fibo))
               System.out.print(fibo + " ");
           a = b;
           b = fibo;

       }
        return fibo;
    };

}