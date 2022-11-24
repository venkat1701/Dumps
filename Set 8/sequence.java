import java.util.*;
class sequence
{
    public static int solve(int arr[],int k)
    {
        Arrays.sort(arr);
        return arr[k];
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Numbers");
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Number of Element");
        int k=sc.nextInt();
        System.out.println("The: "+k+"th Largest Number is : "+solve(arr,k));
    }
}