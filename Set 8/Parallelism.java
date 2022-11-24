
class Parallelism
{
    
    public static void main(String[] args)
    {       
        new customThread();
        new customThread2();
        for(int i=1;i<=10;i++)
        System.out.println("Hello@@");
        System.out.println("Application Ended___________");
    }
}
class customThread extends Thread
{
    customThread()
    {
        Thread t=new Thread(this,"Created thread");
        t.start();
    }
    @Override 
    public void run()
    {
        for(int i=1;i<=10;i++)
        System.out.println("Hello");
    }
}
class customThread2 extends Thread
{
    customThread2()
    {
        Thread t=new Thread(this,"Current Thread");
        t.start();
    }
    @Override
    public void run()
    {
        for(int i=1;i<=10;i++)
        System.out.println("Bye");
    }
}