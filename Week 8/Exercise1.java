import java.awt.*;

class Exercise1 
{
public static void main(String args[])
{
Frame f = new Frame("MY FIRST FRAME"); 
f.setLayout(new GridLayout(10,1));
f.setSize(400,500);
f.setBackground(Color.yellow);

Panel p = new Panel();
p.setSize(300,300);
p.setBackground(Color.BLUE);
f.add(p);

Button b = new Button("BUTTON");
b.setSize(400,400);
b.setBackground(Color.GREEN);
b.setForeground(Color.RED);
f.add(b);


CheckboxGroup cg = new CheckboxGroup();

Checkbox cb1 = new Checkbox("CSE",cg,true);
cb1.setSize(200,200);
cb1.setBackground(Color.WHITE);
cb1.setForeground(Color.RED);
f.add(cb1);

Checkbox cb2 = new Checkbox("IT",cg,true);
cb2.setSize(200,200);
cb2.setBackground(Color.WHITE);
cb2.setForeground(Color.RED);
f.add(cb2);


Label l = new Label("MY FIRST LABEL");
l.setBackground(Color.GREEN);
l.setForeground(Color.BLUE);
l.setFont(new Font("Times Roman",Font.ITALIC,30));
f.add(l); 

TextField t1 = new TextField(19);
t1.setBackground(Color.WHITE);
t1.setText("HELLO WORLD");
t1.setFont(new Font("Times Roman",Font.ITALIC,15));
t1.setForeground(Color.RED);
f.add(t1);


List ll1 = new List(3);
ll1.add("list 1");
ll1.add("list 2");
ll1.add("list 3");
ll1.setBackground(Color.CYAN);
f.add(ll1);


Choice ch = new Choice();
ch.add("CHOICE 1");
ch.add("CHOICE 2");
ch.add("CHOICE 3");
ch.setBackground(Color.PINK);
f.add(ch);

TextArea ta = new TextArea("I AM AN SOFTWARE ENGINEER");
ta.setBackground(Color.PINK);
ta.setForeground(Color.BLUE);
f.add(ta);

Scrollbar sh = new Scrollbar(Scrollbar.HORIZONTAL ,0,10,30,30);
f.add(sh);

Scrollbar sv = new Scrollbar(Scrollbar.VERTICAL , 0,10,30,30);
f.add(sv);

f.show();
}
}