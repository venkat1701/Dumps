import java.util.*;
class inc_txc
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Salary");
        int sal=sc.nextInt();
        sal*=12;
        double tax=0.0D;
        if(sal<=130000)
        tax=0.0;
        else if(sal>=130001 && sal<=200000)
        {
        sal-=130000;
        tax=0.15*sal;
        }
        else if(sal>=200001 && sal<=250000)
        {
            
        sal-=200000;
        tax=0.20*sal;
        }
        else
        {
        sal-=250000;
        tax=0.30*sal;
        }
        try{
            Thread.sleep(1000000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("The Tax Payable = "+tax);
    }
}