import java.util.Scanner;
import java.util.*;
public class DynamicImplementation {
	public static void main(String[] args)
	{
		DynamicArray<Integer> implementation=new DynamicArray<Integer>(16);
		Scanner sc=new Scanner(System.in);
		for(Integer i=0;i<=20;i++)
			{
				implementation.add(sc.nextInt());
			}
		for(Integer i=0;i<=17;i++)
			System.out.println(implementation.get(i));
		Arrays.sort(null);
	}
}
