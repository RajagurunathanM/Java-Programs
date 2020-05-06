import java.awt.*;
import java.applet.*;

public class HelloAppletSecondWay extends Applet
{
	
	int x,y,w,h;
	
	public void init()     //defaultly called if we not declared
	{    
	System.out.println("init occured");
	    resize(1000,1000);
		//setBackground(Color.PINK);
		//setForeground(Color.BLUE);
		x = Integer.parseInt(getParameter("xvalue"));
		y = Integer.parseInt(getParameter("yvalue"));
		w = Integer.parseInt(getParameter("wvalue"));
		h = Integer.parseInt(getParameter("hvalue"));
		
		
	}
	
	
	public void paint(Graphics k)
	{
		
		k.drawString("HELLO APPLET WORLD:  X is" + x +" Y is "+y,50,50);
		
		k.drawRect(x,y,w,h);
		k.fillRect(x,y,w,h);
		k.setColor(Color.GREEN);
		k.drawOval(100,100,20,20);
		k.fillOval(100,100,20,20);
		k.setColor(Color.GREEN);
		k.drawArc(200,200,200,200,200,200);
		k.fillArc(200,200,200,200,200,200);
		k.setColor(Color.ORANGE);
		
		
		
	}
	
}


/*

<html>
<body>
<applet code ="HelloAppletSecondWay.class" width= "300" height ="300" align="absmiddle" name="MYAPPLET" vspace = "250" hspace ="250">
<param name = xvalue value=300>
<param name = yvalue value=300>
<param name = wvalue value=200>
<param name = hvalue value=200>


</applet>
</body>
</html>

*/