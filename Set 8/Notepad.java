import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;
import java.awt.datatransfer.*;
import java.io.*;
class Notepad extends JFrame implements ActionListener
{
    Container c;
    JButton share,file,write;
    JTextArea jtf;
    Clipboard cb;
    JTextField tft;
    JLabel lbl;
    Notepad()
    {
        //Getting the Content Pane for setting up of Objects.
        c=getContentPane();
        c.setLayout(null);
        share=new JButton("Share");
        share.setBounds(450, 380, 73, 23);
        c.add(share);
        //Instantiating JTextArea.
        jtf=new JTextArea();
        jtf.setBounds(30, 30, 510, 290);
        c.add(jtf);
        jtf.setLineWrap(true);
        
        //Clipboard Settings.
        share.addActionListener(this);
        
        file=new JButton("Read File");
        file.setBounds(330,380,100,23);
        c.add(file);
        file.addActionListener(this);
        
        write=new JButton("Write File");
        write.setBounds(220,380,100,23);
        c.add(write);
        write.addActionListener(this);
        

        tft=new JTextField("For Eg: D:\\Hello.txt");
        tft.setBounds(100,340,200,23);
        c.add(tft);
        
        
        lbl=new JLabel("File Name:");
        lbl.setBounds(30,340,70,23);
        c.add(lbl);
        
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(c);
        }
        catch(Exception e)
        {
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==share)
        {
             useClip uc=new useClip(jtf.getText());
             JOptionPane.showMessageDialog(c,"Text is Copied");
        }
        if(ae.getSource()==file)
        {
            if(tft.getText().equals("For Eg: D:\\Hello.txt"))
            {
                tft.setText("");
            }
            if(tft.getText().equals(""))
            {
                JOptionPane.showMessageDialog(c,"Enter File Name");
            }
            String filename=tft.getText();
            readFile rf=new readFile(filename,c,jtf);
        }
        if(ae.getSource()==write)
        {
            if(tft.getText().equals("For Eg: D:\\Hello.txt"))
            {
                tft.setText("");
            }
            if(tft.getText().equals(""))
            {
                JOptionPane.showMessageDialog(c,"Enter File Name");
            }
            String filename=tft.getText();
            JOptionPane.showMessageDialog(c,"Your File will be Re-Written.All your data will go away","Data Loss Possibility",JOptionPane.WARNING_MESSAGE);
            writeFile wf=new writeFile(filename,c,jtf);
        }
        
    }
    public static void main(String args[])
    {
        Notepad np=new Notepad();
        np.setSize(650,450);
        np.setTitle("JNotes");
        np.setVisible(true);
    }
}
class useClip extends Frame implements ClipboardOwner
{
    String stri;
    useClip(String str2)
    {
        this.stri=str2;
        Clipboard cb=getToolkit().getSystemClipboard();
        StringSelection ss=new StringSelection(this.stri);
        cb.setContents(ss,this);
    }
    public void lostOwnership(Clipboard cb,Transferable ss)
    {
        //Empty Method Body.
    }
}
class readFile 
{
    readFile(String str,Container c,JTextArea jtf)
    {
        String sentence="";
        try
        {
            FileInputStream fis=new FileInputStream("D:\\New Text Document.txt");
            int charc;
            int clt=0;
            while((charc=fis.read())!=-1)
            {
                clt++;
                sentence=sentence+(char)charc;
                if(sentence.charAt(clt)=='.')
                {
                    StringBuffer sb=new StringBuffer("\n"+sentence);
                    sentence=String.valueOf(sb);
                }
            }
            jtf.setText(sentence);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(c,"File Not Found","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
}
class writeFile
{
    writeFile(String str,Container c,JTextArea jtf)
    {
        try
        {
            FileOutputStream fos=new FileOutputStream(str);
            fos.write(jtf.getText().getBytes());
            fos.flush();
            fos.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(c,"Text cannot be written","Text Issues",JOptionPane.WARNING_MESSAGE);
        }
    }
}