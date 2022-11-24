import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class Digital_CLOCK extends JFrame
{
    Container c;
    Calendar cl;
    Digital_CLOCK()
    {
        c=getContentPane();
        cl=Calendar.getInstance();
        c.setLayout(null);
        JLabel date=new JLabel(cl.get(Calendar.DATE)+" / "+(cl.get(Calendar.MONTH)+1)+" / "+cl.get(Calendar.YEAR));
        date.setBounds(100,100,200,200);
        c.add(date);
        JLabel time=new JLabel("");
        time.setBounds(100,160,200,200);
        c.add(time);
        ActionListener acl=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                time.setText(cl.get(Calendar.HOUR)+" : "+cl.get(Calendar.MINUTE)+" : "+cl.get(Calendar.SECOND));
            }
        };
        
    }
    public static void main(String[] args)
    {
        Digital_CLOCK dc=new Digital_CLOCK();
        dc.setSize(400,400);
        dc.setVisible(true);
        dc.setTitle("Digital Clock");
    }
}