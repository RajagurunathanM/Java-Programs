import java.awt.*;

class MyFrame
{
	
	MyFrame()
	{
		Frame f = new Frame("FIRST FRAME");
f.setLayout(new FlowLayout());
f.resize(1000,1000);
f.setBackground(Color.PINK);


Panel p = new Panel();
p.resize(150,150);
p.setBackground(Color.GREEN);
f.add(p);


Button b = new Button("CLICK ME");
b.setBounds(200,200,150,50);
f.add(b);


Checkbox c = new Checkbox("NPTEL",false);
c.setBounds(200,300,80,80);
f.add(c);

Label l1 = new Label("LABEL 111111111");
l1.setBounds(200,400,150,150);
l1.setForeground(Color.RED);
f.add(l1);

TextField t = new TextField();
t.setBounds(300,100,80,80);
t.setBackground(Color.YELLOW);
f.add(t);


TextArea ta = new TextArea("TEXT AREA EXAMPLE");
ta.setBounds(100,100,200,200);
ta.setBackground(Color.WHITE);
f.add(ta);

List l = new List(5);
l.setBounds(100,100,100,100);
l.setBackground(Color.YELLOW);
l.add("LIST1");
l.add("LIST2");
l.add("LIST3");
l.add("LIST4");
l.add("LIST5");

f.add(l);

Choice ch = new Choice();
ch.setBounds(100,100,100,100);
ch.setBackground(Color.GREEN);
ch.add("choice LIST1");
ch.add("choice LIST2");
ch.add("choice LIST3");
ch.add("choice LIST4");
ch.add("choice LIST5");
f.add(ch);


Scrollbar sb = new Scrollbar(1);
sb.setBounds(300,100,50,200);
f.add(sb);




f.show();

	}
	
public static void main(String args[])
{
	new MyFrame();
	new MyFrame();

}
}