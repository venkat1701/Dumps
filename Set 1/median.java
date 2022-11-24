import java.util.*;
class median
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Observations");
        int n=sc.nextInt();
        System.out.println("Enter the Observations");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp, limit=n-1;
        boolean flag=true;
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false)
            break;
            else
            flag=false;
        }
        System.out.println("Sorted Observations: -");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        double med=0;
        if(n%2==0)
        {
            med=((n/2) + (n/2+1))/2;
            System.out.println("Median is = "+arr[(int)med]);
        }
        else
        {
            med=n/2+1;
            System.out.println("Median is = "+arr[(int)med]);
        }
    }
}