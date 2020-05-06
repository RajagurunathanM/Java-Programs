import java.awt.*;

class LAYOUT
{
	public boolean action(Event e, Object obj)
	{
		if(e.target instanceof Button)
		{
			
			this.setText((String) obj);
		}
	    return false;
	}
		
public static void main(String args[])
{
Frame f = new Frame("LAYOUT EXAMPLE");
f.setSize(500,500);
f.setBackground(Color.PINK);
f.setLayout(new GridLayout(3,2,50,50));


Button b1,b2,b3,b4,b5;
Label t1 = new Label("0");
t1.setBackground(Color.BLUE);
f.add(t1);

b1 = new Button("ONE 1");
b1.setBackground(Color.YELLOW);
b1.setForeground(Color.BLUE);
b1.setBounds(10,10,70,70);
f.add(b1);//,BorderLayout.NORTH); 

b2 = new Button("TWO 2");
b2.setBackground(Color.YELLOW);
b2.setForeground(Color.RED);
f.add(b2);//,BorderLayout.SOUTH); 

b3 = new Button("THREE 3");
b3.setBackground(Color.YELLOW);
b3.setForeground(Color.BLUE);
f.add(b3);//,BorderLayout.WEST); 

b4 = new Button("FOUR 4");
b4.setBackground(Color.YELLOW);
b4.setForeground(Color.BLUE);
f.add(b4);//,BorderLayout.EAST); 

b5 = new Button("FIVE 5");
b5.setBackground(Color.YELLOW);
b5.setForeground(Color.BLUE);
f.add(b5);//,BorderLayout.CENTER); 


f.show();
}
}