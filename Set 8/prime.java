class prime
{
    public static void main(String args[]) {
        int n=50,count=0;
        int arr[]=new int[n+1];
        int a=0,b=1,c=0;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            count=0;
            for(int j=1;j<=c;j++)
            {
                if(c%j==0)
                    count++;
            }
            if(count==2){
                arr[i]=c;
            }

            a=b;
            b=c;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                continue;
            else
                System.out.print(arr[i]+" ");
        }
    }
}