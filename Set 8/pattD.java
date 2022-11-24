class pattD
{
    public static void main(String [] args)
    {
        int c=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((j==5 && c==0)||(i==2 && (j>=2 && j<=4))||(i==3 && (j>=2 && j<=4))||(i==4 && (j>=2 && j<=4))||(j==5 && c==4))
                System.out.print("  ");
                else
                System.out.print("*"+" ");
            }
            c++;
            System.out.println();
        }
    }
}