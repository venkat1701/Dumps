import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class streams
{
    public static void main()
    {
        List<Integer> lst=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            lst.add(i);
        }
        Stream<Integer> sm=lst.stream();
        Integer[] arr=sm.filter(i -> i<9).toArray(Integer[]::new);
        for(Integer i:arr)
        System.out.println(i);
    }
}