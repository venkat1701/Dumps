import java.util.Scanner;

public class StaticImplementation {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length");
		int length=sc.nextInt();
		StaticArray<Integer> implementation=new StaticArray<Integer>(length);
		System.out.println("Enter the Numbers: ");
		for(int i=0;i<=length-1;i++)
		{
			implementation.add(sc.nextInt());
		}
		for(int i=0;i<=implementation.size()-1;i++)
		{
			System.out.println(implementation.get(i));
		}
	}
}
