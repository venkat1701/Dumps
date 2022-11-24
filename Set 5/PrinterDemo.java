import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.awt.PrintGraphics.*;

class PrintableDemo implements Printable
{
	public int print(Graphics g,PageFormat pf,int pageIndex)
	{
		if(pageIndex!=0)
			return NO_SUCH_PAGE;
		Graphics2D g2d=(Graphics2D)g;
		g2d.setFont(new Font("Times New Roman",Font.PLAIN,30));
		g2d.setPaint(Color.black);
		g2d.drawString("Java Source and Support",144,144);
		return PAGE_EXISTS;
	}
	public static void main(String[] args)
	{
		PrinterJob pj=PrinterJob.getPrinterJob();
		pj.setPrintable(new PrintableDemo());
		if(pj.printDialog())
		{
			try
			{
				pj.print();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}