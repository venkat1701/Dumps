import java.applet.Applet;
import java.awt.*;
class DemoApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello World",150,200);
    }
    public static void main()
    {
        DemoApplet da=new DemoApplet();
        da.setSize(300,300);
        da.setVisible(true);
    }
}