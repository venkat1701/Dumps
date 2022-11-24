class strprime
{
    static boolean isPrime(int num)
    {
        if(num%2==0 || num%3==0 || num%5==0)
        {
            return false;
        }
        else
        return true;
    }
    public static void main(int num)
    {
        int succ=num+1,pre=num-1,mean=0;
        if(!isPrime(num) || num==2)
        System.out.println("Not a Strong-Prime Number");
        
        if(isPrime(num)==true)
        {
            while(!isPrime(succ) || !isPrime(pre))
            {
                if(!isPrime(succ))
                {
                    succ++;
                }
                if(!isPrime(pre))
                {
                    pre--;
                }
            }
            mean=(succ+pre)/2;
            if(num>mean)
            System.out.println("It is a Strong-Prime Number");
            else
            System.out.println("It is not a Strong-Prime Number");
        }       
    }
}