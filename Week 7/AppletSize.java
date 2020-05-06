import java.awt.*;
import java.applet.*;

public class AppletSize extends Applet
{
	
	
	
	public void paint(Graphics g)
	{
		Dimension d = this.getSize();
	    int x = d.height;
	    int y= d.width;
		g.drawString("kjfjksfbsb",100,100);
	}
}

/*

<html>
<body>
<applet code ="AppletSize.class" width= "300" height ="300" align="absmiddle" name="MYAPPLET" vspace = "250" hspace ="250">
<param name = xvalue value=500>
<param name = yvalue value=500>
<param name = wvalue value=200>
<param name = hvalue value=200>


</applet>
</body>
</html>

*/