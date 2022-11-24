import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.security.Permission.*;
class QuizApp extends JFrame implements ActionListener
{
    Container c;
    JInternalFrame jip1;
    JButton startExam;
    int count=0;
    QuizApp()
    {
        //Container Instantiation.
        c=getContentPane();
        c.setLayout(null);
        //Container Instantiation.
        
        //InternalFrame Instantiation.
        jip1=new JInternalFrame();
        jip1.setBounds(25, 11, 595, 428);
        jip1.setVisible(true);
        jip1.setLayout(null);
        c.add(jip1);
        //InternalFrame Instantiation.
        
        //Start Exam Button.
        startExam=new JButton("Start Exam");
        jip1.add(startExam);
        startExam.setBounds(201, 135, 176, 60);
        startExam.addActionListener(this);
        //Start Exam Button.
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(c);
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(c,"Could Not Set the Look and Feel","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==startExam && count==0)
        {
            count++;
            QuestionBank qb=new QuestionBank();
            qb.setTitle("Question Bank");
            qb.setSize(500,500);
            qb.setVisible(true);
            startExam.setEnabled(false);
        }
    }
    public static void main(String[] args)
    {
        QuizApp qa=new QuizApp();
        qa.setTitle("Entrance Quiz");
        qa.setSize(700,550);
        qa.setVisible(true);
    }
}
class QuestionBank extends JFrame
{
    Container c;
    QuestionBank()
    {
        c=getContentPane();
        c.setLayout(null);
        question("Full Form of HCl","Hydrogen Chloride","Chlorine HydroChloride");
    }
    public void question(String str,String opt1,String opt2)
    {
        //Internal Frame Instantiation.
        JInternalFrame fr=new JInternalFrame();
        fr.setVisible(true);
        fr.setTitle("Questions");
        fr.setLayout(null);
        fr.setBounds(20,20,400,400);
        c.add(fr);
        //Internal Frame Instantiation.
        
        //JTextArea Instantiation
        JTextArea jta=new JTextArea();
        jta.setText(str);
        jta.setEditable(false);
        jta.setBounds(20,40,350,80);
        fr.add(jta);
        //JTextArea Instantiation
        
        ButtonGroup bg=new ButtonGroup();
        JRadioButton r1=new JRadioButton(opt1);
        r1.setBounds(70, 150, 203, 23);
        fr.add(r1);
        bg.add(r1);
        
        JRadioButton r2=new JRadioButton(opt2);
        r2.setBounds(70, 200, 303, 23);
        fr.add(r2);
        bg.add(r2);
    }
    
}