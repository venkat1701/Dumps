import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
class quiz extends JFrame implements ActionListener
{
Container c;
int j;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
JPanel pnl1,pnl2;
JButton c3;
JButton submitall;
JLabel label,label2;
JLabel lb1,lb2,lb3,lb4;
JTextField tf;
String str1,str2,str3,str4,str5,str6,str7,str8,str9,str10;
quiz()
{
c=getContentPane();
c.setLayout(null);
pnl1=new JPanel();
pnl1.setBorder(BorderFactory.createEtchedBorder());
pnl2=new JPanel();
pnl2.setBorder(BorderFactory.createEtchedBorder());
c.add(pnl1);
c.add(pnl2);
pnl1.setBounds(0,0,500,30);
pnl2.setBounds(0,441,500,30);
b1=new Button("Question #1");
b2=new Button("Question #2");
b3=new Button("Question #3");
b4=new Button("Question #4");
b5=new Button("Question #5");
b6=new Button("Question #6");
b7=new Button("Question #7");
b8=new Button("Question #8");

b9=new Button("Question #9");
b10=new Button("Question #10");
c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);
c.add(b5);
c.add(b6);
c.add(b7);
c.add(b8);
c.add(b9);
c.add(b10);
b1.setBounds(70, 90, 73, 23);
b2.setBounds(160, 90, 73, 23);
b3.setBounds(250, 90, 73, 23);
b4.setBounds(340, 90, 73, 23);
b5.setBounds(110, 130, 73, 23);
b6.setBounds(210, 130, 73, 23);
b7.setBounds(300, 130, 73, 23);
b8.setBounds(160, 170, 73, 23);
b9.setBounds(260, 170, 73, 23);
b10.setBounds(210, 210, 79, 23);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
submitall=new JButton("Submit All");
submitall.setEnabled(false);
c.add(submitall);
submitall.setBounds(200, 310, 100, 23);
try
{

UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
);
SwingUtilities.updateComponentTreeUI(c);
}
catch(Exception e)
{}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
b1class a=new b1class();
a.setVisible(true);
j++;
a.setSize(500,350);
a.setTitle("Question #1");
b1.setEnabled(false);
}
if(ae.getSource()==b2)
{
j++;
b2class b=new b2class();
b.setVisible(true);
b.setSize(500,350);
b.setTitle("Question #2");
b2.setEnabled(false);
}
if(ae.getSource()==b3)
{
j++;
b3class c=new b3class();
c.setVisible(true);
c.setSize(500,350);
c.setTitle("Question #3");
b3.setEnabled(false);
}
if(ae.getSource()==b4)

{
j++;
b4class d=new b4class();
d.setVisible(true);
d.setSize(500,350);
d.setTitle("Question #4");
b4.setEnabled(false);
}
if(ae.getSource()==b5)
{
j++;
b5class e=new b5class();
e.setVisible(true);
e.setSize(500,350);
e.setTitle("Question #5");
b5.setEnabled(false);
}
if(ae.getSource()==b6)
{
j++;
b6class f=new b6class();
f.setVisible(true);
f.setSize(500,350);
f.setTitle("Question #6");
b6.setEnabled(false);
}
if(ae.getSource()==b7)
{
j++;
b7class g=new b7class();
g.setVisible(true);
g.setSize(500,350);
g.setTitle("Question #7");
b7.setEnabled(false);
}
if(ae.getSource()==b8)
{
j++;

b8class h=new b8class();
h.setVisible(true);
h.setSize(500,350);
h.setTitle("Question #8");
b8.setEnabled(false);
}
if(ae.getSource()==b9)
{
j++;
b9class i=new b9class();
i.setVisible(true);
i.setSize(500,350);
i.setTitle("Question #9");
b9.setEnabled(false);
}
if(ae.getSource()==b10)
{
j++;
b10class j=new b10class();
j.setVisible(true);
j.setSize(500,350);
j.setTitle("Question #10");
b10.setEnabled(false);
submitall.setEnabled(true);
submitall.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent xyz)
{
sb s=new sb();
s.setSize(400,350);
s.setVisible(true);
}
});
}
}
class b1class extends JDialog implements ActionListener
{
Container d;

JDialog dg1;
JRadioButton a1,a2,a3,a4;
ButtonGroup bg1;
JLabel lbl;
JButton c1,c2,c3;
b1class()
{
quiz q=new quiz();
d=getContentPane();
dg1=new JDialog(q,"Question #1",true);
dg1.setLayout(null);
dg1.setSize(500,500);
d.setLayout(null);
lbl=new JLabel("What is the Brightest Gas Present on Earth");
d.add(lbl);
lbl.setBounds(22, 52, 346, 57);
bg1=new ButtonGroup();
a1=new JRadioButton("Xenon");
a2=new JRadioButton("Helium");
a3=new JRadioButton("Neon");
a4=new JRadioButton("Krypton");
bg1.add(a1);
bg1.add(a2);
bg1.add(a3);
bg1.add(a4);
a1.setBounds(52,127,55,23);
a2.setBounds(52,150,64,26);
a3.setBounds(52,173,51,23);
a4.setBounds(52,200,80,23);
d.add(a1);
d.add(a2);
d.add(a3);
d.add(a4);
pack();
a1.addActionListener(this);
a2.addActionListener(this);
a3.addActionListener(this);
a4.addActionListener(this);

c1=new JButton("Check Answer");
c2=new JButton("Exit");
c3=new JButton("Move to Next Question");
c1.setBounds(15, 266, 101, 23);
c2.setBounds(134, 266, 75, 23);
c3.setBounds(227, 266, 143, 23);
d.add(c1);
d.add(c2);
d.add(c3);
c1.addActionListener(this);
c2.addActionListener(this);
c3.addActionListener(this);
}
public void actionPerformed(ActionEvent be)
{
if(be.getSource()==c1)
{
if(a1.getModel().isSelected())
{
a2.setEnabled(false);
a3.setEnabled(false);
a4.setEnabled(false);
str1="Xenon";
JOptionPane.showMessageDialog(d,"You gave the correct answer. Well Done");
j++;
}
if(a2.getModel().isSelected())
{
a1.setEnabled(false);
a3.setEnabled(false);
a4.setEnabled(false);
JOptionPane.showMessageDialog(d,"Sorry Your Answer is Incorrect","Wrong Answer Given",JOptionPane.WARNING_MESSAGE);
j++;
str1="Helium";
}
if(a3.getModel().isSelected())

{
a1.setEnabled(false);
a2.setEnabled(false);
a4.setEnabled(false);
JOptionPane.showMessageDialog(d,"Sorry Your Answer is Incorrect","Wrong Answer Given",JOptionPane.WARNING_MESSAGE);
j++;
str1="Neon";
}
if(a4.getModel().isSelected())
{
a1.setEnabled(false);
a2.setEnabled(false);
a3.setEnabled(false);
JOptionPane.showMessageDialog(d,"Sorry Your Answer is Incorrect","Wrong Answer Given",JOptionPane.WARNING_MESSAGE);
j++;
str1="Krypton";
}
}
if(be.getSource()==c2)
{
System.exit(0);
}
if(be.getSource()==c3)
{
this.setVisible(false);
}
}
}
class b2class extends JDialog implements ActionListener
{
Container e;
JDialog dg2;
JRadioButton d1,d2,d3,d4;
ButtonGroup bg2;
JLabel lbl1;
JButton e1,e2,e3;

b2class()
{
quiz q=new quiz();
e=getContentPane();
dg2=new JDialog(q,"Question #2",true);
dg2.setLayout(null);
dg2.setSize(500,500);
e.setLayout(null);
lbl1=new JLabel("What is the chemical name of Sulphuric Acid.");
e.add(lbl1);
lbl1.setBounds(22, 52, 346, 57);
bg2=new ButtonGroup();
d1=new JRadioButton("Hydrogen Sulphide");
d2=new JRadioButton("Hydrogen Sulphate");
d3=new JRadioButton("Hydrogen Trisulphide");
d4=new JRadioButton("Hydrogen Sulphite");
bg2.add(d1);
bg2.add(d2);
bg2.add(d3);
bg2.add(d4);
d1.setBounds(52, 127, 120, 23);
d2.setBounds(52, 150, 117, 23);
d3.setBounds(52, 173, 132, 23);
d4.setBounds(52, 200, 135, 23);
e.add(d1);
e.add(d2);
e.add(d3);
e.add(d4);
pack();
d1.addActionListener(this);
d2.addActionListener(this);
d3.addActionListener(this);
d4.addActionListener(this);
e1=new JButton("Check Answer");
e2=new JButton("Exit");
e3=new JButton("Move to Next Question");
e1.setBounds(15, 266, 101, 23);
e2.setBounds(134, 266, 75, 23);

e3.setBounds(227, 266, 143, 23);
e.add(e1);
e.add(e2);
e.add(e3);
e1.addActionListener(this);
e2.addActionListener(this);
e3.addActionListener(this);
}
public void actionPerformed(ActionEvent ce)
{
if(ce.getSource()==e1)
{
if(d1.getModel().isSelected())
{
d2.setEnabled(false);
d3.setEnabled(false);
d4.setEnabled(false);
JOptionPane.showMessageDialog(e,"You gave the correct answer. WellDone");
str2="Hydrogen Sulphide";
}
if(d2.getModel().isSelected())
{
d1.setEnabled(false);
d3.setEnabled(false);
d4.setEnabled(false);
JOptionPane.showMessageDialog(e,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
str2="Hydrogen Sulphate";
}
if(d3.getModel().isSelected())
{
d1.setEnabled(false);
d2.setEnabled(false);
d4.setEnabled(false);
JOptionPane.showMessageDialog(e,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
str2="Hydrogen TriSulphide";

}
if(d4.getModel().isSelected())
{
d1.setEnabled(false);
d2.setEnabled(false);
d3.setEnabled(false);
JOptionPane.showMessageDialog(e,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
str2="Hydrogen Sulphite";
}
}
if(ce.getSource()==e2)
{
System.exit(0);
}
if(ce.getSource()==e3)
{
this.setVisible(false);
}
}
}
class b3class extends JDialog implements ActionListener
{
Container f;
JDialog dg3;
JRadioButton z1,z2,z3,z4;
ButtonGroup bg3;
JLabel lbl2;
JButton x1,x2,x3;
b3class()
{
quiz q=new quiz();
f=getContentPane();
dg3=new JDialog(q,"Question #2",true);
dg3.setLayout(null);
dg3.setSize(500,500);
f.setLayout(null);
lbl2=new JLabel("What is the reason behind the dissapearing of Planets orGalaxies from our Universe ?");
f.add(lbl2);
lbl2.setBounds(39, 50, 450, 27);
bg3=new ButtonGroup();
z1=new JRadioButton("BlueShift");
z2=new JRadioButton("RedShift");
z3=new JRadioButton("Both 1. and 2.");
z4=new JRadioButton("None of the Above");
bg3.add(z1);
bg3.add(z2);
bg3.add(z3);
bg3.add(z4);
z1.setBounds(52, 127, 120, 23);
z2.setBounds(52, 150, 117, 23);
z3.setBounds(52, 173, 132, 23);
z4.setBounds(52, 200, 135, 23);
f.add(z1);
f.add(z2);
f.add(z3);
f.add(z4);
pack();
z1.addActionListener(this);
z2.addActionListener(this);
z3.addActionListener(this);
z4.addActionListener(this);
x1=new JButton("Check Answer");
x2=new JButton("Exit");
x3=new JButton("Move to Next Question");
x1.setBounds(15, 266, 101, 23);
x2.setBounds(134, 266, 75, 23);
x3.setBounds(227, 266, 143, 23);
f.add(x1);
f.add(x2);
f.add(x3);
x1.addActionListener(this);
x2.addActionListener(this);
x3.addActionListener(this);
}

public void actionPerformed(ActionEvent de)
{
if(de.getSource()==x1)
{
if(z1.getModel().isSelected())
{
z2.setEnabled(false);
z3.setEnabled(false);
z4.setEnabled(false);
str3="BlueShift";
JOptionPane.showMessageDialog(f,"Sorry Your Answer is Incorrect","Wrong Answer Given",JOptionPane.WARNING_MESSAGE);
}
if(z2.getModel().isSelected())
{
z1.setEnabled(false);
z4.setEnabled(false);
z3.setEnabled(false);
str3="RedShift";
JOptionPane.showMessageDialog(f,"Sorry Your Answer is Incorrect","Wrong Answer Given",JOptionPane.WARNING_MESSAGE);
}
if(z3.getModel().isSelected())
{
z1.setEnabled(false);
z2.setEnabled(false);
z4.setEnabled(false);
str3="Both 1. and 2.";
JOptionPane.showMessageDialog(f,"You Gave the correct Answer . Well Done");
}
if(z4.getModel().isSelected())
{
z1.setEnabled(false);
z3.setEnabled(false);
z2.setEnabled(false);
str3="None of the Above";
JOptionPane.showMessageDialog(f,"Sorry Your Answer is Incorrect","Wrong Answer Given",JOptionPane.WARNING_MESSAGE);
}
}
if(de.getSource()==x2)
{
System.exit(0);
}
if(de.getSource()==x3)
{
this.setVisible(false);
}
}
}
class b4class extends JDialog implements ActionListener
{
Container g;
JDialog dg4;
JRadioButton g1,g2,g3,g4;
ButtonGroup bg4;
JLabel lbl4;
JButton abc1,abc2,abc3;
b4class()
{
quiz q=new quiz();
g=getContentPane();
dg4=new JDialog(q,"Question #2",true);
dg4.setLayout(null);
dg4.setSize(500,500);
g.setLayout(null);
lbl4=new JLabel("If you were to rate this Quiz, how much points would you have given to it?");
g.add(lbl4);
lbl4.setBounds(22, 52, 450, 57);
bg4=new ButtonGroup();
g1=new JRadioButton("10");
g2=new JRadioButton("8");
g3=new JRadioButton("9");
g4=new JRadioButton("7");

bg4.add(g1);
bg4.add(g2);
bg4.add(g3);
bg4.add(g4);
g1.setBounds(52, 127, 120, 23);
g2.setBounds(52, 150, 117, 23);
g3.setBounds(52, 173, 132, 23);
g4.setBounds(52, 200, 135, 23);
g.add(g1);
g.add(g2);
g.add(g3);
g.add(g4);
pack();
g1.addActionListener(this);
g2.addActionListener(this);
g3.addActionListener(this);
g4.addActionListener(this);
abc1=new JButton("Check Answer");
abc2=new JButton("Exit");
abc3=new JButton("Move to Next Question");
abc1.setBounds(15, 266, 101, 23);
abc2.setBounds(134, 266, 75, 23);
abc3.setBounds(227, 266, 143, 23);
g.add(abc1);
g.add(abc2);
g.add(abc3);
abc1.addActionListener(this);
abc2.addActionListener(this);
abc3.addActionListener(this);
}
public void actionPerformed(ActionEvent ee)
{
if(ee.getSource()==abc1)
{
if(g1.getModel().isSelected())
{
g2.setEnabled(false);
g3.setEnabled(false);

g4.setEnabled(false);
str4="10";
JOptionPane.showMessageDialog(g,"Thank You For Your Feedback");
}
if(g2.getModel().isSelected())
{
g1.setEnabled(false);
g3.setEnabled(false);
g4.setEnabled(false);
str4="8";
JOptionPane.showMessageDialog(g,"Thank You For Your Feedback");
}
if(g3.getModel().isSelected())
{
g2.setEnabled(false);
g1.setEnabled(false);
g4.setEnabled(false);
str4="9";
JOptionPane.showMessageDialog(g,"Thank You For Your Feedback");
}
if(g4.getModel().isSelected())
{
g2.setEnabled(false);
g3.setEnabled(false);
g1.setEnabled(false);
str4="7";
JOptionPane.showMessageDialog(g,"Thank You For Your Feedback");
}
}
if(ee.getSource()==abc2)
{
System.exit(0);
}
if(ee.getSource()==abc3)
{
this.setVisible(false);
}
}

}
class b5class extends JDialog implements ActionListener
{
Container h;
JDialog dg5;
JRadioButton h1,h2,h3,h4;
ButtonGroup bg5;
JLabel lbl7;
JButton hb1,hb2,hb3;
b5class()
{
quiz q=new quiz();
h=getContentPane();
dg5=new JDialog(q,"Question #2",true);
dg5.setLayout(null);
dg5.setSize(500,500);
h.setLayout(null);
lbl7=new JLabel("Where do you find Kuala Lumpur in the World?");
h.add(lbl7);
lbl7.setBounds(22, 52, 346, 57);
bg5=new ButtonGroup();
h1=new JRadioButton("Malaysia");
h2=new JRadioButton("Thailand");
h3=new JRadioButton("Indonesia");
h4=new JRadioButton("India");
bg5.add(h1);
bg5.add(h2);
bg5.add(h3);
bg5.add(h4);
h1.setBounds(52, 127, 120, 23);
h2.setBounds(52, 150, 117, 23);
h3.setBounds(52, 173, 132, 23);
h4.setBounds(52, 200, 135, 23);
h.add(h1);
h.add(h2);
h.add(h3);
h.add(h4);
pack();

h1.addActionListener(this);
h2.addActionListener(this);
h3.addActionListener(this);
h4.addActionListener(this);
hb1=new JButton("Check Answer");
hb2=new JButton("Exit");
hb3=new JButton("Move to Next Question");
hb1.setBounds(15, 266, 101, 23);
hb2.setBounds(134, 266, 75, 23);
hb3.setBounds(227, 266, 143, 23);
h.add(hb1);
h.add(hb2);
h.add(hb3);
hb1.addActionListener(this);
hb2.addActionListener(this);
hb3.addActionListener(this);
}
public void actionPerformed(ActionEvent fe)
{
if(fe.getSource()==hb1)
{
if(h1.getModel().isSelected())
{
h2.setEnabled(false);
h3.setEnabled(false);
h4.setEnabled(false);
str5="Malaysia";
JOptionPane.showMessageDialog(h,"You gave the correct answer. Well Done");
}
if(h2.getModel().isSelected())
{
h1.setEnabled(false);
h3.setEnabled(false);
h4.setEnabled(false);
str5="Thailand";
JOptionPane.showMessageDialog(h,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);

}
if(h3.getModel().isSelected())
{
str5="Indonesia";
h1.setEnabled(false);
h2.setEnabled(false);
h4.setEnabled(false);
JOptionPane.showMessageDialog(h,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(h4.getModel().isSelected())
{
h1.setEnabled(false);
h2.setEnabled(false);
h3.setEnabled(false);
str5="India";
JOptionPane.showMessageDialog(h,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
}
if(fe.getSource()==hb2)
{
System.exit(0);
}
if(fe.getSource()==hb3)
{
this.setVisible(false);
}
}
}
class b6class extends JDialog implements ActionListener
{
Container i;
JDialog dg8;
JRadioButton i1,i2,i3,i4;
ButtonGroup bg6;
JLabel lbl9;
JButton ix1,ix2,ix3;

b6class()
{
quiz q=new quiz();
i=getContentPane();
dg8=new JDialog(q,"Question #2",true);
dg8.setLayout(null);
dg8.setSize(500,500);
i.setLayout(null);
lbl9=new JLabel("How many seats of Rajya Sabha are reserved for UttarPradesh.");
i.add(lbl9);
lbl9.setBounds(22, 52, 450, 57);
bg6=new ButtonGroup();
i1=new JRadioButton("11");
i2=new JRadioButton("19");
i3=new JRadioButton("10");
i4=new JRadioButton("31");
bg6.add(i1);
bg6.add(i2);
bg6.add(i3);
bg6.add(i4);
i1.setBounds(52, 127, 120, 23);
i2.setBounds(52, 150, 117, 23);
i3.setBounds(52, 173, 132, 23);
i4.setBounds(52, 200, 135, 23);
i.add(i1);
i.add(i2);
i.add(i3);
i.add(i4);
pack();
i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
i4.addActionListener(this);
ix1=new JButton("Check Answer");
ix2=new JButton("Exit");
ix3=new JButton("Move to Next Question");
ix1.setBounds(15, 266, 101, 23);

ix2.setBounds(134, 266, 75, 23);
ix3.setBounds(227, 266, 143, 23);
i.add(ix1);
i.add(ix2);
i.add(ix3);
ix1.addActionListener(this);
ix2.addActionListener(this);
ix3.addActionListener(this);
}
public void actionPerformed(ActionEvent ge)
{
if(ge.getSource()==ix1)
{
if(i1.getModel().isSelected())
{
i2.setEnabled(false);
i3.setEnabled(false);
i4.setEnabled(false);
str6="11";
JOptionPane.showMessageDialog(i,"You gave the correct answer. WellDone");
}
if(i2.getModel().isSelected())
{
i1.setEnabled(false);
i3.setEnabled(false);
i4.setEnabled(false);
str6="19";
JOptionPane.showMessageDialog(i,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(i3.getModel().isSelected())
{
i2.setEnabled(false);
i1.setEnabled(false);
i4.setEnabled(false);
str6="10";
JOptionPane.showMessageDialog(i,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(i4.getModel().isSelected())
{
i2.setEnabled(false);
i3.setEnabled(false);
i1.setEnabled(false);
str6="31";
JOptionPane.showMessageDialog(i,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
}
if(ge.getSource()==ix2)
{
System.exit(0);
}
if(ge.getSource()==ix3)
{
this.setVisible(false);
}
}
}
class b7class extends JDialog implements ActionListener
{
Container k;
JDialog dg8;
JRadioButton k1,k2,k3,k4;
ButtonGroup bg0;
JLabel lbl80;
JButton kx1,kx2,kx3;
b7class()
{
quiz q=new quiz();
k=getContentPane();
dg8=new JDialog(q,"Question #2",true);
dg8.setLayout(null);
dg8.setSize(500,500);
k.setLayout(null);

lbl80=new JLabel("What if you were surrounded by sharks all around?");
k.add(lbl80);
lbl80.setBounds(22, 52, 346, 57);
bg0=new ButtonGroup();
k1=new JRadioButton("Sharks would have Eaten You.");
k2=new JRadioButton("You would have eaten Sharks.");
k3=new JRadioButton("Third Party would have eaten you both.");
k4=new JRadioButton("None of the Above");
bg0.add(k1);
bg0.add(k2);
bg0.add(k3);
bg0.add(k4);
k1.setBounds(52, 127, 320, 23);
k2.setBounds(52, 150, 317, 23);
k3.setBounds(52, 173, 332, 23);
k4.setBounds(52, 200, 335, 23);
k.add(k1);
k.add(k2);
k.add(k3);
k.add(k4);
pack();
k1.addActionListener(this);
k2.addActionListener(this);
k3.addActionListener(this);
k4.addActionListener(this);
kx1=new JButton("Check Answer");
kx2=new JButton("Exit");
kx3=new JButton("Move to Next Question");
kx1.setBounds(15, 266, 101, 23);
kx2.setBounds(134, 266, 75, 23);
kx3.setBounds(227, 266, 143, 23);
k.add(kx1);
k.add(kx2);
k.add(kx3);
kx1.addActionListener(this);
kx2.addActionListener(this);
kx3.addActionListener(this);
}

public void actionPerformed(ActionEvent ie)
{
if(ie.getSource()==kx1)
{
if(k1.getModel().isSelected())
{
k2.setEnabled(false);
k3.setEnabled(false);
k4.setEnabled(false);
str7="Sharks would have Eaten You.";
JOptionPane.showMessageDialog(k,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(k2.getModel().isSelected())
{
k1.setEnabled(false);
k3.setEnabled(false);
k4.setEnabled(false);
str7="You would have eaten Sharks.";
JOptionPane.showMessageDialog(k,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(k3.getModel().isSelected())
{
k2.setEnabled(false);
k1.setEnabled(false);
k4.setEnabled(false);
str7="Third Party would have eaten you both.";
JOptionPane.showMessageDialog(k,"You Gave the Correct Answer.WellDone");
}
if(k4.getModel().isSelected())
{
k2.setEnabled(false);
k3.setEnabled(false);
k1.setEnabled(false);
str7="None of the Above";
JOptionPane.showMessageDialog(k,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
}
if(ie.getSource()==kx2)
{
System.exit(0);
}
if(ie.getSource()==kx3)
{
this.setVisible(false);
}
}
}
class b8class extends JDialog implements ActionListener
{
Container l;
JDialog dgl;
JRadioButton l1,l2,l3,l4;
ButtonGroup bgl;
JLabel lbll;
JButton lx1,lx2,lx3;
b8class()
{
quiz q=new quiz();
l=getContentPane();
dgl=new JDialog(q,"Question #2",true);
dgl.setLayout(null);
dgl.setSize(500,500);
l.setLayout(null);
lbll=new JLabel("What is time required by a average human brain to crack a 8 digit password.");
l.add(lbll);
lbll.setBounds(22, 52, 450, 57);
bgl=new ButtonGroup();
l1=new JRadioButton("418 Million Years");
l2=new JRadioButton("209 Million Years");
l3=new JRadioButton("10 Billion Years");
l4=new JRadioButton("More than a Thousand Million Years.");

bgl.add(l1);
bgl.add(l2);
bgl.add(l3);
bgl.add(l4);
l1.setBounds(52, 127, 320, 23);
l2.setBounds(52, 150, 317, 23);
l3.setBounds(52, 173, 332, 23);
l4.setBounds(52, 200, 335, 23);
l.add(l1);
l.add(l2);
l.add(l3);
l.add(l4);
pack();
l1.addActionListener(this);
l2.addActionListener(this);
l3.addActionListener(this);
l4.addActionListener(this);
lx1=new JButton("Check Answer");
lx2=new JButton("Exit");
lx3=new JButton("Move to Next Question");
lx1.setBounds(15, 266, 101, 23);
lx2.setBounds(134, 266, 75, 23);
lx3.setBounds(227, 266, 143, 23);
l.add(lx1);
l.add(lx2);
l.add(lx3);
lx1.addActionListener(this);
lx2.addActionListener(this);
lx3.addActionListener(this);
}
public void actionPerformed(ActionEvent le)
{
if(le.getSource()==lx1)
{
if(l1.getModel().isSelected())
{
l2.setEnabled(false);
l3.setEnabled(false);

l4.setEnabled(false);
str8="418 Million Years";
JOptionPane.showMessageDialog(l,"You gave the correct answer. WellDone");
}
if(l2.getModel().isSelected())
{
l1.setEnabled(false);
l3.setEnabled(false);
l4.setEnabled(false);
str8="209 Million Years";
JOptionPane.showMessageDialog(l,"Sorry Your Answer is Incorrect","Wrongnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(l3.getModel().isSelected())
{
l2.setEnabled(false);
l1.setEnabled(false);
l4.setEnabled(false);
str8="10 Billion Years";
JOptionPane.showMessageDialog(l,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(l4.getModel().isSelected())
{
l2.setEnabled(false);
l3.setEnabled(false);
l1.setEnabled(false);
str8="More than a Thousand Million Years.";
JOptionPane.showMessageDialog(l,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
}
if(le.getSource()==lx2)
{
System.exit(0);
}
if(le.getSource()==lx3)

{
this.setVisible(false);
}
}
}
class b9class extends JDialog implements ActionListener
{
Container m;
JDialog dgm;
JRadioButton m1,m2,m3,m4;
ButtonGroup bgm;
JLabel lblm;
JButton mx1,mx2,mx3;
b9class()
{
quiz q=new quiz();
m=getContentPane();
dgm=new JDialog(q,"Question #2",true);
dgm.setLayout(null);
dgm.setSize(500,500);
m.setLayout(null);
lblm=new JLabel("What among this has been derived from the US Constitution in our Constitution?");
m.add(lblm);
lblm.setBounds(22, 52, 450, 57);
bgm=new ButtonGroup();
m1=new JRadioButton("Fundamental Rights");
m2=new JRadioButton("Procedure Established by Law");
m3=new JRadioButton("Suppression of Fundamental Rights during Emergency");
m4=new JRadioButton("Federal Scheme");
bgm.add(m1);
bgm.add(m2);
bgm.add(m3);
bgm.add(m4);
m1.setBounds(52, 127, 320, 23);
m2.setBounds(52, 150, 317, 23);
m3.setBounds(52, 173, 332, 23);
m4.setBounds(52, 200, 335, 23);

m.add(m1);
m.add(m2);
m.add(m3);
m.add(m4);
pack();
m1.addActionListener(this);
m2.addActionListener(this);
m3.addActionListener(this);
m4.addActionListener(this);
mx1=new JButton("Check Answer");
mx2=new JButton("Exit");
mx3=new JButton("Move to Next Question");
mx1.setBounds(15, 266, 101, 23);
mx2.setBounds(134, 266, 75, 23);
mx3.setBounds(227, 266, 143, 23);
m.add(mx1);
m.add(mx2);
m.add(mx3);
mx1.addActionListener(this);
mx2.addActionListener(this);
mx3.addActionListener(this);
}
public void actionPerformed(ActionEvent me)
{
if(me.getSource()==mx1)
{
if(m1.getModel().isSelected())
{
m2.setEnabled(false);
m3.setEnabled(false);
m4.setEnabled(false);
str9="Fundamental Rights";
JOptionPane.showMessageDialog(m,"You gave the correct answer. Well Done");
}
if(m2.getModel().isSelected())
{
m1.setEnabled(false);

m3.setEnabled(false);
m4.setEnabled(false);
str9="Procedure Established by Law";
JOptionPane.showMessageDialog(m,"Sorry Your Answer is Incorrect","Wrong Answer Given",JOptionPane.WARNING_MESSAGE);
}
if(m3.getModel().isSelected())
{
m1.setEnabled(false);
m2.setEnabled(false);
m4.setEnabled(false);
str9="Suppression of Fundamental Rights during Emergency";
JOptionPane.showMessageDialog(m,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(m4.getModel().isSelected())
{
m1.setEnabled(false);
m2.setEnabled(false);
m3.setEnabled(false);
str9="Federal Scheme";
JOptionPane.showMessageDialog(m,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
}
if(me.getSource()==mx2)
{
System.exit(0);
}
if(me.getSource()==mx3)
{
this.setVisible(false);
}
}
}
class b10class extends JDialog implements ActionListener
{
Container o;

JDialog dgo;
JRadioButton o1,o2,o3,o4;
ButtonGroup bgo;
JLabel lblo;
JButton ox1,ox2,ox3;
b10class()
{
quiz q=new quiz();
o=getContentPane();
dgo=new JDialog(q,"Question #2",true);
dgo.setLayout(null);
dgo.setSize(500,500);
o.setLayout(null);
lblo=new JLabel("What is the Full form of UPSC");
o.add(lblo);
lblo.setBounds(22, 52, 346, 57);
bgo=new ButtonGroup();
o1=new JRadioButton("Union Public State Commission");
o2=new JRadioButton("United Public State Commission");
o3=new JRadioButton("Union Private Stating Commission");
o4=new JRadioButton("Union Public Service Commissioner");
bgo.add(o1);
bgo.add(o2);
bgo.add(o3);
bgo.add(o4);
o1.setBounds(52, 127, 320, 23);
o2.setBounds(52, 150, 317, 23);
o3.setBounds(52, 173, 332, 23);
o4.setBounds(52, 200, 335, 23);
o.add(o1);
o.add(o2);
o.add(o3);
o.add(o4);
pack();
o1.addActionListener(this);
o2.addActionListener(this);
o3.addActionListener(this);
o4.addActionListener(this);

ox1=new JButton("Check Answer");
ox2=new JButton("Exit");
ox3=new JButton("Move to Next Question");
ox1.setBounds(15, 266, 101, 23);
ox2.setBounds(134, 266, 75, 23);
ox3.setBounds(227, 266, 143, 23);
o.add(ox1);
o.add(ox2);
o.add(ox3);
ox1.addActionListener(this);
ox2.addActionListener(this);
ox3.addActionListener(this);
}
public void actionPerformed(ActionEvent oe)
{
if(oe.getSource()==ox1)
{
if(o1.getModel().isSelected())
{
str10="Union Public State Commission";
o2.setEnabled(false);
o3.setEnabled(false);
o4.setEnabled(false);
JOptionPane.showMessageDialog(o,"You gave the correct answer. WellDone");
}
if(o2.getModel().isSelected())
{
o1.setEnabled(false);
o3.setEnabled(false);
o4.setEnabled(false);
str10="United Public State Commission";
JOptionPane.showMessageDialog(o,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(o3.getModel().isSelected())
{
o2.setEnabled(false);

o1.setEnabled(false);
o4.setEnabled(false);
str10="Union Private Stating Commission";
JOptionPane.showMessageDialog(o,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
if(o4.getModel().isSelected())
{
o2.setEnabled(false);
o3.setEnabled(false);
o1.setEnabled(false);
str10="Union Public Service Commissioner";
JOptionPane.showMessageDialog(o,"Sorry Your Answer is Incorrect","WrongAnswer Given",JOptionPane.WARNING_MESSAGE);
}
}
if(oe.getSource()==ox2)
{
System.exit(0);
}
if(oe.getSource()==ox3)
{
this.setVisible(false);
}
}
}
class sb extends JFrame
{
Container fg;
JTextArea taa;
sb()
{
fg=getContentPane();
fg.setLayout(new FlowLayout());
taa=new JTextArea();
taa.setEditable(false);
taa.setText(str1);
taa.setText(taa.getText()+"\n"+str2);

taa.setText(taa.getText()+"\n"+str3);
taa.setText(taa.getText()+"\n"+str4);
taa.setText(taa.getText()+"\n"+str5);
taa.setText(taa.getText()+"\n"+str6);
taa.setText(taa.getText()+"\n"+str7);
taa.setText(taa.getText()+"\n"+str8);
taa.setText(taa.getText()+"\n"+str9);
taa.setText(taa.getText()+"\n"+str10);
fg.add(taa);
}
}
public static void main()
{
quiz q=new quiz();
q.setSize(500,500);
q.setVisible(true);
q.setTitle("Computer Quiz");
}
}