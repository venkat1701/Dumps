import java.util.Scanner;

public class SeriesGeometricProgression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Nth Term");
		int n=sc.nextInt();
		sc.close();
		int term=2;
		for(int i=1;i<=n;i++)
		{
			System.out.print((i*i)+i+" , ");
		}
	}
}
