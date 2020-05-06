import java.awt.*;
import java.applet.*;

public class BannerApplet extends Applet implements Runnable
{
	String msg; 
	Thread t = null;
	public void init()
	{
		msg=getParameter("strvalue");
		resize(250,250);
		setBackground(Color.CYAN);
		setForeground(Color.RED);
		
	}
	
	
	public void start()
	{
		t = new Thread(this);
		t.start();	
	}
	
	public void run()
	{
		char ch;
		for(; ;)
		{
			try
			{
				//repaint();
				Thread.sleep(10);
				ch = msg.charAt(0);
				msg = msg.substring(1,msg.length());
				msg += ch;
			}
			catch(Exception e)
			{}
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,50,30);
	}
	
}