import java.io.*;
class MyThread3 extends Thread
{
    public boolean stop=false;
    public void run()
    {
        for(int i=1;i<=100000;i++)
        {
            try{
                Thread.sleep(2000);
            System.out.println(i);
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
            if(stop) return;
        }
    }
    public static void main(String[] args)throws IOException
    {
        MyThread3 obj1=new MyThread3();
        Thread t1=new Thread(obj1);
        t1.start();
        System.in.read();
        obj1.stop=true;
    }
}