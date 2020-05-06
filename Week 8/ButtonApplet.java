import java.awt.*;
import java.applet.*;

public class ButtonApplet extends Applet
{
Button b;
public void init()
{
System.out.println("APPLET STARTED ITS EXECUTION");
setBackground(Color.PINK);

b = new Button("BUTTON IN APPLET");
b.setBounds(0,0,100,30);
b.setBackground(Color.BLUE);
add(b);
}
}

/*
<html>
<body>
<applet code = "ButtonApplet.class" width = 700 height =700 >
</applet>
</body>
</html>
*/