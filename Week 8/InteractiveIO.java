import java.applet.*;
import java.awt.*;

public class InteractiveIO extends Applet
{
	TextField t1,t2;
	String s1,s2,s;
    int x=0,y=0,z=0;
	
	public void init()
	{
		resize(1000,1000);
		t1 = new TextField(10);
		t2 = new TextField(10);
		add(t1);
		add(t2);
		t1.setText("0");
		t2.setText("1");

	}
	
	
	public void paint(Graphics g)
	{
		
		
		g.drawString("ENTER TWO VALUES",50,100);
		try
		{
		s1=t1.getText();
		x = Integer.parseInt(s1);
		s2= t2.getText();
		y = Integer.parseInt(s2);
		z=x+y;
		s=String.valueOf(z);
		g.drawString("THE VALUE OF SUM IS",50,200);
		g.drawString(s,250,200);
		
		}
		catch(Exception e){}
		
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
<applet code ="InteractiveIO.class" width=500 height =500>
</applet>
</body>
</html>
*/
		