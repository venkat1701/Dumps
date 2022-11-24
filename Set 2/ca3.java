import java.util.*;
class ca3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 40 names with roll number followed by marks out of 300");
        String name[]=new String[6];
        int roll[]=new int[6];
        int tot[]=new int[6];
        for(int j=0;j<5;j++)
        {
            name[j]=sc.next();
            roll[j]=sc.nextInt();
            tot[j]=sc.nextInt();
        }
        for(int i=0;i<6;i++)
        {
            if(tot[i]>tot[i+1])
            {
                tot[i]=tot[i+1];
                name[i]=name[i+1];
                roll[i]=roll[i+1];
            }
            else if(tot[i]<tot[i+1])
            {
                tot[i+1]=tot[i];
                name[i+1]=name[i];
                roll[i+1]=roll[i];
            }
        }
        System.out.println("Name"+"\t"+"Roll Number"+"\t"+"Total Marks");
        for(int i=0;i<5;i++)
        {
            System.out.println(name[i]+"\t"+roll[i]+"\t"+tot[i]);
        }
    }
}