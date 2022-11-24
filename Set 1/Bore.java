import java.awt.*;
import javax.swing.*;
class Bore extends JFrame
{
    Bore()
    {
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
    }
    public static void main()
    {
        Bore b=new Bore();
        b.setSize(500,900);
        b.setTitle("Boring Game");
        b.setVisible(true);
        ImageIcon i=new ImageIcon("C:\\Users\\ariha\\Downloads\\P-icon-color.jpg");
        b.setIconImage(i.getImage());
        
    }
}