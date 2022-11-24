import java.awt.*;
import javax.swing.*;
class Country extends JFrame 
{
    Container c;
    Country()
    {
        c=getContentPane();
        c.setLayout(null);
    }
    public static void main()
    {
        Country coun=new Country();
        coun.setSize(500,500);
        coun.setVisible(true);
        coun.setTitle("Country Game");
    }
}