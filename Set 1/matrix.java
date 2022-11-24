import java.util.*;
class matrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int rows=sc.nextInt();
        System.out.println("Enter the Number of Columns");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter the Elements till : "+rows*cols);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}