import java.applet.*;
import java.awt.*;

public class appletdemo extends Applet
{
	public void init()
	{    
	  
		setBackground(Color.YELLOW);
		
	}
public void paint(Graphics g)
{
	int x=0;
	int y=0;
	String m="";
	
	x=Integer.parseInt(getParameter("Xposition"));
	y=Integer.parseInt(getParameter("Yposition"));
	m=getParameter("m");
g.drawString(m,x,y);
}
}

/*
<applet code="appletdemo.class" width=300 height=300>
<param name="Xposition" value="150" />
<param name="Yposition" value="150" />
<param name="m" value="THIS IS PARAMETER APPLET" />
</applet>
*/
