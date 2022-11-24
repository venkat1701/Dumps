class MyThread4 implements Runnable
{
    public void run()
    {
        task1();
        task2();
        task3();
    }
    void task1()
    {
        System.out.println("This is Task Number 1");
    }
    void task2()
    {
        System.out.println("This is Task Number 2");
    }
    void task3()
    {
        System.out.println("This is Task Number 3");
    }
    public static void main(String[] args)
    {
        MyThread4 obj=new MyThread4();
        Thread t1=new Thread(obj);
        t1.start();
    }
}