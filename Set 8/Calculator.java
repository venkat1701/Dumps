import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener
{
    Container c;
    JTextArea output;
    JButton ceBut,cBut,Del,plus,minus,div,mul,equal;
    JButton num1,num2,num3,num4,num5,num6,num7,num8,num9;
    JButton rateUs;
    int operator;
    Double numval=0.0D;
    Double val;
    JLabel lbl;
    JTextArea finallbl;
    JRadioButton on,off;
    ButtonGroup bg;
    Calculator()
    {
        c=getContentPane();
        c.setLayout(null);
        
        output=new JTextArea();
        output.setEditable(false);
        output.setBounds(10,15,350,100);
        
        c.add(output);
        
        //Instantiation of Secondary Arithmetic Operator Buttons.
        ceBut=new JButton("CE");
        ceBut.setBounds(10, 131, 65, 23);
        ceBut.addActionListener(this);
        c.add(ceBut);
        
        cBut=new JButton("C");
        cBut.setBounds(81, 131, 70, 23);
         cBut.addActionListener(this);
        c.add(cBut);
        
        Del=new JButton("Del");
        Del.setBounds(157, 131, 65, 23);
         Del.addActionListener(this);
        c.add(Del);
        
        plus=new JButton("+");
        plus.setBounds(250, 120, 60, 53);
         plus.addActionListener(this);
        c.add(plus);
        
        div=new JButton("/");
        div.setBounds(250, 180, 60, 53);
         div.addActionListener(this);
        c.add(div);
        
        mul=new JButton("*");
        mul.setBounds(250, 240, 60, 53);
         mul.addActionListener(this);
        c.add(mul);
        
        minus=new JButton("-");
        minus.setBounds(250, 300, 60, 53);
         minus.addActionListener(this);
        c.add(minus);
        
        equal=new JButton("=");
        equal.setBounds(250, 363, 140, 30);
         equal.addActionListener(this);
        c.add(equal);
        //Instantiation of Secondary Arithmetic Operator Buttons.
        
        //Instantiation of Number Buttons.
        num1=new JButton("1");
        num1.setBounds(10, 350, 60, 23);
         num1.addActionListener(this);
        c.add(num1);
        
        num2=new JButton("2");
        num2.setBounds(90, 350, 60, 23);
         num2.addActionListener(this);
        c.add(num2);
        
        num3=new JButton("3");
         num3.addActionListener(this);
        num3.setBounds(170, 350, 60, 23);
        c.add(num3);
        
        num4=new JButton("4");
        num4.setBounds(10, 290, 60, 23);
         num4.addActionListener(this);
        c.add(num4);
        
        num5=new JButton("5");
        num5.setBounds(90, 290, 60, 23);
         num5.addActionListener(this);
        c.add(num5);
        
        num6=new JButton("6");
        num6.setBounds(170, 290, 60, 23);
         num6.addActionListener(this);
        c.add(num6);
        
        num7=new JButton("7");
        num7.setBounds(10, 230, 60, 23);
         num7.addActionListener(this);
        c.add(num7);
        
        num8=new JButton("8");
        num8.setBounds(90, 230, 60, 23);
         num8.addActionListener(this);
        c.add(num8);
        
        num9=new JButton("9");
        num9.setBounds(170, 230, 60, 23);
         num9.addActionListener(this);
        c.add(num9);
        //Instantiation of Number Buttons.
        
        lbl=new JLabel("");
        lbl.setBounds(10,181,200,10);
        c.add(lbl);
        
        finallbl=new JTextArea("");
        finallbl.setBounds(315,140,60,200);
        finallbl.setEditable(true);
        finallbl.setLineWrap(true);
        c.add(finallbl);
        
        ButtonGroup bg=new ButtonGroup();
        on=new JRadioButton("ON");
        on.setBounds(360,15,20,20);
        bg.add(on);
        c.add(on);
        off=new JRadioButton("OFF");
        off.setBounds(360,40,20,20);
        bg.add(off);
        c.add(off);
        
        on.addActionListener(this);
        off.addActionListener(this);
        
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            SwingUtilities.updateComponentTreeUI(c);
        }
        catch(Exception e)
        {
            
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==on)
        {
            onState();
        }
        if(ae.getSource()==off)
        {
            offState();
        }
        try
        {
            int FONT_SIZE=20;
        Font f=new Font("Sans Serif",Font.BOLD,FONT_SIZE);
        output.setFont(f);
        if(ae.getSource()==ceBut)
        {
            output.setText("");
        }
        if(ae.getSource()==cBut)
        {
            output.setText("");
            lbl.setText("");
        }
        if(ae.getSource()==plus)
        {
            operator=1;
            numval=Double.parseDouble(output.getText());
            lbl.setText(output.getText()+"+");
            output.setText("");           
        }
        if(ae.getSource()==minus)
        {
            operator=2;
            numval=Double.parseDouble(output.getText());
            lbl.setText(output.getText()+"-");
            output.setText("");
            
        }
        if(ae.getSource()==mul)
        {
             operator=3;
            numval=Double.parseDouble(output.getText());
            lbl.setText(output.getText()+"*");
            output.setText("");
            //output.setText(output.getText()+"*");

        }
        if(ae.getSource()==div)
        {
            operator=4;
            numval=Double.parseDouble(output.getText());
            lbl.setText(output.getText()+"/");
            output.setText("");
            //output.setText(output.getText()+"/");
            
        }
        if(ae.getSource()==Del)
        {
            if(output.getText().length()>0)
            {
                StringBuffer sb=new StringBuffer(output.getText());
                sb.deleteCharAt(output.getText().length()-1);
                output.setText(sb.toString());
            }            
        }
        if(ae.getSource()==num1)
        {
            output.setText(output.getText()+"1");
        }
        if(ae.getSource()==num2)
        {
            output.setText(output.getText()+"2");
        }
        if(ae.getSource()==num3)
        {
            output.setText(output.getText()+"3");
        }
        if(ae.getSource()==num4)
        {
            output.setText(output.getText()+"4");
        }
        if(ae.getSource()==num5)
        {
            output.setText(output.getText()+"5");
        }
        if(ae.getSource()==num6)
        {
            output.setText(output.getText()+"6");
        }
        if(ae.getSource()==num7)
        {
            output.setText(output.getText()+"7");
        }
        if(ae.getSource()==num8)
        {
            output.setText(output.getText()+"8");
        }
        if(ae.getSource()==num9)
        {
            output.setText(output.getText()+"9");
        }
        if(ae.getSource()==equal)
        {
            switch(operator)
            {
                case 1:val=numval+Double.parseDouble(output.getText());
                       output.setText(String.valueOf(val));
                       break;
                case 2:val=numval-Double.parseDouble(output.getText());
                       output.setText(String.valueOf(val));
                       break;
                 case 3:val=numval*Double.parseDouble(output.getText());
                       output.setText(String.valueOf(val));
                       break;
                case 4:val=numval/Double.parseDouble(output.getText());
                       output.setText(String.valueOf(val));
                       break;
            }
            finallbl.setText(finallbl.getText()+"\n"+output.getText());            
        }
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(c,"No Number Detected","Enter Number",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void onState()
    {
        cBut.setEnabled(true);
        ceBut.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        mul.setEnabled(true);
        div.setEnabled(true);
        Del.setEnabled(true);
        num1.setEnabled(true);
        num2.setEnabled(true);
        num3.setEnabled(true);
        num4.setEnabled(true);
        num5.setEnabled(true);
        num6.setEnabled(true);
        num7.setEnabled(true);
        num8.setEnabled(true);
        num9.setEnabled(true);
        equal.setEnabled(true);
    }
    public void offState()
    {
        cBut.setEnabled(false);
        ceBut.setEnabled(false);
        plus.setEnabled(false);
        minus.setEnabled(false);
        mul.setEnabled(false);
        div.setEnabled(false);
        Del.setEnabled(false);
        num1.setEnabled(false);
        num2.setEnabled(false);
        num3.setEnabled(false);
        num4.setEnabled(false);
        num5.setEnabled(false);
        num6.setEnabled(false);
        num7.setEnabled(false);
        num8.setEnabled(false);
        num9.setEnabled(false);
        equal.setEnabled(false);
    }
    public static void main(String args[])
    {
        Calculator cal=new Calculator();
        Image ii=Toolkit.getDefaultToolkit().getImage("C:\\Users\\ariha\\Desktop\\Calc.jpg");
        cal.setTitle("Jaiswal's Calculator");
        cal.setVisible(true);
        cal.setSize(420,450);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setIconImage(ii);
    }
}