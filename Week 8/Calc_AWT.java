import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Calc_AWT extends Applet implements MouseListener,MouseMotionListener
{
	    Label f1,s2,res;
		
		TextField fval,sval,rval;
		
		Button add,sub,mul,div;
		String str1,str2,str;
		double x=0,y=0,z=0;
		
	public void init()
	{
		/*Frame f = new Frame("CALC_AWT FRAME");
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.setSize(700,700);
		f.setBackground(Color.pink);
		*/
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		
		f1 = new Label("FIRST  VALUE");
		f1.setBackground(Color.white);
		f1.setForeground(Color.WHITE);
		add(f1);
		
		fval = new TextField(10);
		fval.setBackground(Color.white);
		fval.setForeground(Color.BLACK);
		add(fval);
		
		
		s2 = new Label("SECOND VALUE");
		s2.setBackground(Color.white);
		add(s2);
		
		sval = new TextField(10);
		sval.setBackground(Color.white);
		sval.setForeground(Color.BLACK);
		add(sval);
		
		res = new Label(" RESULT ");
		f1.setBackground(Color.black);
		add(res);
		
		rval = new TextField(10);
		rval.setBackground(Color.white);
		rval.setForeground(Color.BLACK);
		add(rval);
		
		
		add = new Button("ADD");
		add.setBackground(Color.YELLOW);
		add.setForeground(Color.BLUE);
		add(add);
		
		
		sub = new Button("SUB");
		sub.setBackground(Color.YELLOW);
		sub.setForeground(Color.BLUE);
		add(sub);
		
		
		mul = new Button("MUL");
		mul.setBackground(Color.YELLOW);
		mul.setForeground(Color.BLUE);
		add(mul);
		
		
		div = new Button("DIV");
		div.setBackground(Color.YELLOW);
		div.setForeground(Color.BLUE);
		add(div);
		
		show();

				
	}
	
	
	
	public boolean action(Event e1, Object obj)
	{
		if(e1.target instanceof Button)
		{
			if(obj == add)
			{
				try{
					
				str1 = fval.getText();
		        x = Integer.parseInt(str1);
		
		        str2 = sval.getText();
		        y = Integer.parseInt(str2);
				
				z=x+y;
		        str=String.valueOf(z);
				rval.setText(str);
				}
				catch(Exception e){}
				
				
			}
			if(obj == sub)
			{
				try
				{
				str1 = fval.getText();
		        x = Integer.parseInt(str1);
		
		        str2 = sval.getText();
		        y = Integer.parseInt(str2);
				
				z=x-y;
		        str=String.valueOf(z);
				rval.setText(str);
				}
				catch(Exception e){}
				
				
			}
			if(obj == mul)
			{
				str1 = fval.getText();
		        x = Integer.parseInt(str1);
		
		        str2 = sval.getText();
		        y = Integer.parseInt(str2);
				
				z=x*y;
		        str=String.valueOf(z);
				rval.setText(str);
				
				
			}
			if(obj == div)
			{
				str1 = fval.getText();
		        x = Integer.parseInt(str1);
		
		        str2 = sval.getText();
		        y = Integer.parseInt(str2);
				
				z=x/y;
		        str=String.valueOf(z);
				rval.setText(str);
				
				
			}
			
			
		}
		repaint();
		
	    return false;
	}
	
	
	 public void paint(Graphics g)
	 {
		try
		{
		        str1 = fval.getText();
		        x = Integer.parseInt(str1);
		
		        str2 = sval.getText();
		        y = Integer.parseInt(str2);
				
				z=x-y;
		        str=String.valueOf(z);
				rval.setText(str);
				
		
		g.drawString(str,250,50);
		
		}
		catch(Exception e){}
		 
	 }
}
		
		
		/*

<html>
<body>
<applet code="Calc_AWT.class" width =400 height = 400>
</applet>
</body>
</html>

*/
		
		
		
		
		
		
		
		