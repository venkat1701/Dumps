class MyThread2
{
    public static void main(String args[])
    {
        System.out.println("The Current Thread is = ");
        Thread t=Thread.currentThread();
        System.out.println("Current Thread = "+t);
        System.out.println("Its Name  = "+t.getName());
    }
}