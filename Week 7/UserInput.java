import java.awt.*;
import java.applet.*;

public class UserInput extends Applet
{
TextField t1,t2;

public void init()
{
	t1 = new TextField(10);
	t2 = new TextField(10);
	add(t1);
	add(t2);
	t1.setText("0");
	t2.setText("0");
}

public void paint(Graphics g)
{
	String s1,s2,s;
	int x=0,y=0,z=0;
	g.drawString("ENTER A NUMBERS IN THE BOXES",150,30);
	
	try
	{
		s1 = t1.getText();
		x = Integer.parseInt(s1);
		
		s2 = t2.getText();
		y = Integer.parseInt(s2);
		
	}
	catch(Exception e)
	{
		z =x+y;
		s = String.valueOf(z);
		g.drawString("THE SUM IS",50,50);
		g.drawString(s,60,50);
	}
}
	
	
	public boolean action (Event event , Object object)
	{
		repaint();
		return true;
	}
	

}

/*

<html>
<body>
<applet code = "UserInput.class" width = 200 height =200>
</applet>
</body>
</html>

*/