import java.io.*;
import java.awt.*;
class GraphicalIO extends Frame
{
TextField number,name,marks;
Button back,done;
Label numLabel,nameLabel,markLabel;

public GraphicalIO()
{
	super("CREATE STUDENT FILE");
}

public void setup()
{
	resize(400,200);
	setLayout(new GridLayout(4,2));
	number = new TextField(25);
	numLabel = new Label("ROLL NUMBER");
	
	name = new TextField(25);
	nameLabel = new Label("NAME ");
	
	marks = new TextField(25);
	markLabel = new Label("MARKS ");
	
	done = new Button("DONE");
	back = new Button("BACK");
	
	add(numLabel);
	add(nameLabel);
	add(markLabel);
	add(done);
	add(back);
	
	show();
}



public static void main(String args[])
{
	GraphicalIO obj = new GraphicalIO();
	obj.setup();
}
}