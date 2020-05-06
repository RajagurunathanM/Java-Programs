import java.awt.*;

class Enter_AWT
{
public static void main(String args[])
{
	Label fn,ln;
	TextField ft,lt;
	Button b1,b2;
	
	Frame f = new Frame("ENTER_AWT");
	f.setSize(500,500);
	f.setLayout(new GridLayout(3,2,20,20));
	f.setBackground(Color.PINK);
	
	fn = new Label("FIRST NAME");
	fn.setForeground(Color.BLUE);
	f.add(fn);
	
	ft = new TextField(10);
	ft.setBackground(Color.white);
	ft.setForeground(Color.BLACK);
	f.add(ft);
	
	ln = new Label("LAST NAME");
	ln.setForeground(Color.BLUE);
	f.add(ln);
	
    lt = new TextField(10);
	lt.setBackground(Color.white);
	lt.setForeground(Color.BLACK);
	f.add(lt);
	
	    b1 = new Button("ENTER");
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.BLUE);
		f.add(b1);
		
		
		b2 = new Button("DONE");
		b2.setBackground(Color.YELLOW);
		b2.setForeground(Color.BLUE);
		f.add(b2);
		
		f.show();
}
}

	
	