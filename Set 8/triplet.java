class triplet
{
    public static void main(int n)
    {
        for(int ba=1;ba<=n;ba++)
        {
            for(int ht=1;ht<=n;ht++)
            {
                for(int hy=1;hy<=n;hy++)
                {
                    if(ht<ba)
                    continue;
                    else
                    {
                        if(((ba*ba)+(ht*ht))==(hy*hy))
                        System.out.print(ba+","+ht+","+hy+";"+" ");
                    }
                }
            }
        }
    }
}