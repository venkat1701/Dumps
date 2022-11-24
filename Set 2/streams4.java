import java.util.stream.*;
import java.util.Scanner;
import java.util.function.*;
import java.util.*;
class streams4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit of Element Entry");
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        System.out.println("Enter the Elements of the Array till the Limit");
        for(Integer i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        long l=Arrays.asList(arr).stream().count();
        System.out.println("The Length of Array is = "+l);
        Stream<Integer> s=Stream.of(arr);        
        s.sorted().forEach(System.out::println);
    }
}