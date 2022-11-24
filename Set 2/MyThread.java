class MyThread implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
                System.out.println(i);
        }
    }
    public static void main()
    {
        MyThread obj=new MyThread();
        Thread t=new Thread(obj);
        t.start();
    }
}
