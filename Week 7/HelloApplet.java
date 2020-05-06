import java.awt.*;
import java.applet.*;

public class HelloApplet extends Applet 
{
	
	int x,y,w,h;
	//String s;
	
	public void init()     //defaultly called if we not declared
	{    
	    System.out.println("INITIALIZATION OCCURS");
	
	    resize(1000,1000);
		setBackground(Color.PINK);
		x = Integer.parseInt(getParameter("xvalue"));
		y = Integer.parseInt(getParameter("yvalue"));
		w = Integer.parseInt(getParameter("wvalue"));
		h = Integer.parseInt(getParameter("hvalue"));
	
		
		
		//s+="init";
	}
	public void start()
	{
		System.out.println("STARTING THE APPLET");
		
		//s+="\nstart\n";
	}
	
	public void update(Graphics g)
	{
		System.out.println("UPDATING THE APPLET");
		setBackground(Color.GREEN);
		setForeground(Color.BLUE);
		g.drawString("updated successfully performed",350,350);
	}
	
	
	public void paint(Graphics k)
	{
		//s+="paint";
		System.out.println("PAINTING THE APPLET");
		update(k);
		k.drawString("HELLO WORLD",50,50);
		k.drawRect(x,y,w,h);
		repaint(k,200,100,100);
		showStatus("APPLET EXECUTION FINISHED");
		
		
	}
	
	public void repaint(Graphics g,long ms,int x,int y)
	{
		System.out.println("RE-----PAINTING THE APPLET");
		
		g.drawString("repaint method",x,y);
	}
	
		
	public void stop()
	{
		System.out.println("STOPPING THE APPLET");
	}
	
	public void destroy()
	{
		System.out.println("APPLET  DESTROYED");
	}
	
}