import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.Graphics2D;

public class Notepad extends JFrame implements ActionListener,ItemListener{
	
	Container c;
	JMenuBar mb;
	JMenu file,edit,format,view,help;
	JMenuItem newOpt,newWin,open,save,saveas,print,exit;
	JCheckBoxMenuItem wordwrap;
	JMenuItem undo,cut,copy,paste,delete,search,find,findnext,replace,selectall;
	JTextArea ta;
	Notepad()
	{
		//COMPONENTS AND CONTENT SETTINGS.
		c=getContentPane();
		c.setLayout(new BorderLayout());
		mb=new JMenuBar();
		c.add("North",mb);
		
		file=new JMenu("File");
		edit=new JMenu("Edit");
		format=new JMenu("Format");
		view=new JMenu("View");
		help=new JMenu("Help");
		
		mb.add(file);
		mb.add(edit);
		mb.add(format);
		mb.add(view);
		mb.add(help);
		
		//Items of Menu
		open=new JMenuItem("Open...                               Ctrl+O");
		save=new JMenuItem("Save...	                                Ctrl+S");
		newOpt=new JMenuItem("New...                                 Ctrl+N");
		newWin=new JMenuItem("New Window...              Ctrl+Shift+N");
		saveas=new JMenuItem("Save As...                       Ctrl+Shift+S");
		print=new JMenuItem("Print...                               Ctrl+P");
		exit=new JMenuItem("Exit");
		
		wordwrap=new JCheckBoxMenuItem("Wrap Text");
		format.add(wordwrap);
		
		file.add(newOpt);
		file.add(newWin);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.addSeparator();
		file.add(print);
		file.addSeparator();
		file.add(exit);
		
		//Items of Menu
		//TextArea
		ta=new JTextArea();
		ta.setEditable(true);
		c.add("Center",ta);
		ta.setLineWrap(false);
		//TextArea
		//Adding Listeners
		open.addActionListener(this);
		newOpt.addActionListener(this);
		newWin.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);
		print.addActionListener(this);
		exit.addActionListener(this);
		wordwrap.addItemListener(this);
		//Adding Listeners
		
		//Adding Mnemonic
		open.setMnemonic('o');
		newOpt.setMnemonic('n');
		newWin.setMnemonic('W');
		print.setMnemonic('p');
		
		//Adding Mnemonics
		
		//Look and Feel
		try
		{
			UIManager.setLookAndFeel("com.sun.javax.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(c);
		}
		catch(Exception e)
		{
		}
		//Look and Feel
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==open) 
		{
			JFileChooser jfc=new JFileChooser();
			int i=jfc.showOpenDialog(this);
			if(i==JFileChooser.APPROVE_OPTION)
			{
				File f=jfc.getSelectedFile();
				String fname=f.getPath();
				openReadFile(fname);
			}
		}
		if(ae.getSource()==newOpt)
		{
			ta.setText("");
		}
		if(ae.getSource()==newWin)
		{
			String[] argu= {"Krish"};
			main(argu);
		}
		if(ae.getSource()==exit)
		{
			System.exit(0);
		}
		if(ae.getSource()==save)
		{
			JOptionPane.showMessageDialog(c,"Option Disabled For Some Time!","Warning",JOptionPane.ERROR_MESSAGE);
		}
		if(ae.getSource()==print)
		{
			try
			{
				PrintableDemo pd=new PrintableDemo();
				ta.print();
			}
			catch(Exception e) {
				
			}
		}
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==wordwrap)
		{
			ta.setLineWrap(true);
		}
	}
	public void openReadFile(String fname)
	{
		//Open Read File Option.
		try {
			String text="",text2="";
			BufferedReader br=new BufferedReader(new FileReader(fname));
			while((text2=br.readLine())!=null)
			{
				text=text2+"\n";
			}
			ta.setText(text);
			br.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(c, "File Reading/Writing Error","Warning",JOptionPane.WARNING_MESSAGE);
		}
	}
	public static void main(String[] args) {
		Image ii=Toolkit.getDefaultToolkit().getImage("C:\\Users\\ariha\\Desktop\\Notepad.jpg");
		Notepad np=new Notepad();
		np.setTitle("Jaiswal's Notepad");
		np.setSize(500,500);
		np.setVisible(true);
		np.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		np.setIconImage(ii);
		np.setLocation(350, 150);
	}

}
