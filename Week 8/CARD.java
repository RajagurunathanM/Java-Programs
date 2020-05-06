import java.awt.*;
import java.applet.*;

public class CARD extends Applet
{
	CardLayout l1;  
public void init()
{
	l1 = new CardLayout();
	//l2 = new CardLayout();
	setLayout(l1);
	//setLayout(l1);
	add("1",new Button("CARD 1"));
	add("2",new Button("CARD 2"));
	add("3",new Button("CARD 3"));
	add("4",new Button("CARD 4"));
	add("5",new Button("CARD 5"));
}

/*


public boolean keyDown(Event e,int key)
{
	l1.next(this);
	return (true);
}

*/

 public boolean action(Event e, Object obj)
	{
		if(e.target instanceof Button)
		{
			l1.previous(this);
		}
	    return false;
	}
}

/*

<html>
<body>
<applet code="CARD.class" width =400 height = 400>
</applet>
</body>
</html>

*/
	