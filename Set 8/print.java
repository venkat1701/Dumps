import java.awt.*;
import java.awt.event.*;
import java.util.*;
class print
{
    public static void main()
    {
        Printer p=new Printer();
    }
}
class Printer extends Frame
{
    Printer()
    {
        PrintJob pb=getToolkit().getPrintJob(this,"Print Graphics",null);
        Graphics g=pb.getGraphics();
        g.drawRect(20,20,100,100);
        g.drawLine(20,20,100,100);
        g.dispose();
        pb.end();
        System.exit(0);
    }
}