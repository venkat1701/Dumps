import java.util.*;
class BubbleSort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit");
        int n=sc.nextInt();
        System.out.println("Enter the Elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();    //Accepting Numbers from User.
        }
        int temp=0;
        for(int i=0;i<n;i++)    //Outer loop for Checking and Swapping.
        {
            for(int j=1;j<(n-i);j++)    //Inner Loop for checking of Linewise
            {
                if(arr[j-1]>arr[j]) //Checking whether number at index "j-1" is > than the number at index "j".
                {
                    temp = arr[j-1];    //Temp. storing value of number j-1
                    arr[j-1] = arr[j];  //Swapping number
                    arr[j] = temp;  //Swapping Number.
                }                
            }
        }
        System.out.println("The Elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}