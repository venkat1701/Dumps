import java.util.*;
class sort
{
    public static void main()
    {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=arr.length-1;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-1;i++)
            System.out.println(arr[i]);
    }
}