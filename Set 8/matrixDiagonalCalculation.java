import java.util.*;
class matrixDiagonalCalculation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int rows=3,cols=3;
        System.out.println("Enter the Elements of the 3 x 3 Matrix");
        int mat[][]=new int[cols][rows];
        //Accepting Values.
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        //Accepting Values.
        //Displaying Matrix.
        System.out.println("Matrix Goes Below");
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        //Displaying Matrix.
    }
}