import java.util.*;
import java.util.Collections.*;
class meanMod
{ 
    //Hello.
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Values");
        int num=sc.nextInt();
        double arr[]=new double[num];
        System.out.println("Enter the Elements");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter 1 to Print Mean of the Numbers");
        System.out.println("Enter 2 to Print Median of Numbers.");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:double mean=0.0D;
                    for(int i=0;i<arr.length;i++)
                    {
                        mean+=arr[i];
                    }
                    mean/=arr.length;
                    System.out.println("The Mean of the Numbers = "+mean);
                    break;
            case 2:double median=0.0D;
                    double evenStore=0.0D,oddStore=0.0D;
                    Arrays.sort(arr);
                    if(num%2==0)
                    {
                        evenStore=arr[(arr.length/2)-1];
                        oddStore=arr[(arr.length+1/2)-1];
                        median=(arr[(arr.length/2)-1]+arr[(arr.length/2)])/2;
                        System.out.println("Median = "+median);
                    }
                    else
                    {
                        median=arr[((arr.length+1)/2)-1];
                        System.out.println("Median is = "+median);
                    }
                    break;
            default:System.out.println("Wrong Choice");
        }
        
    }
}