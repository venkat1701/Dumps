import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class streams3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit of Array");
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Stream<Integer> sm=Stream.of(arr);
        sm.sorted().forEach(System.out::println);
    }
}