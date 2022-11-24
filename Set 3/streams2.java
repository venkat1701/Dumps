import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class streams2
{
    public static void main()
    {
        Integer[] arr={4,6,7,2,3,8,0};
        Stream<Integer> sm= Stream.of(arr);
        sm.filter(x -> x>2).forEach(System.out::println);
    }
}