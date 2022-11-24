import java.util.*;
class matDiagCalc
{
    static Scanner sc=new Scanner(System.in);
    static int rows=3,cols=3;
    static void matrixMethods(String str,int[][] xyz)
    {
        int arr[][]=xyz;
        switch(str)
        {
            case "Accept":System.out.println("Enter the Elements of the Matrix");
                            for(int i=0;i<cols;i++)
                            {
                                for(int j=0;j<rows;j++)
                                {
                                    arr[i][j]=sc.nextInt();
                                }
                            }
                            break;
            case "Print":for(int i=0;i<cols;i++)
                            {
                                for(int j=0;j<rows;j++)
                                {
                                    System.out.print(arr[i][j]+"\t");
                                }
                                System.out.println();
                            }
                            break;
            case "Transpose":for(int i=0;i<rows;i++)
                            {
                                for(int j=0;j<cols;j++)
                                {
                                    System.out.print(arr[i][j]+"\t");
                                }
                                System.out.println();
                            }
                            break;
            case "Diagonal Sum":int total=0;
                                for(int i=0;i<cols;i++)
                                {
                                    for(int j=0;j<rows;j++)
                                    {
                                        if(((i==0 && j==2)||(i==1 && j==1)||(i==2 && j==0))||(i==0 && j==0)||(i==2 && j==2))
                                        {
                                            total+=arr[i][j];
                                        }                                        
                                    }
                                }
                                System.out.println("The total = "+(total+arr[cols-2][rows-2]));
                            break;                
            default:System.out.println("Exception in Program Code");                
        }
    }
    public static void main(String args[])
    {
        
        int mat[][]=new int[cols][rows];
        matrixMethods("Accept",mat);
        System.out.println("Original Matrix");
        matrixMethods("Print",mat);
        System.out.println("Transpose Matrix");
        matrixMethods("Transpose",mat);
        System.out.println("Diagonal's Sum");
        matrixMethods("Diagonal Sum",mat);
    }
}