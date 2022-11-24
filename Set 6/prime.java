package com.company;


import java.util.function.Function;
import java.util.function.Predicate;
class prime
{
    public static void main(String args[])
    {
        fibonacci.apply(30);
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