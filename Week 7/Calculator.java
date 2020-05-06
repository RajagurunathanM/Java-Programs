import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Calculator extends Applet implements ActionListener
{
	TextField t1;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Button add,sub,mul,div,mod,clear,EQ;
	
	char op;
	String msg=" ";
	int v1,v2,result;
	
	public void init()
	{
		
		//resize(700,700);
		Color k = new Color(120,89,90);
		setBackground(k);
		t1 = new TextField(10);
		t1.setBounds(0,0,70,700);
		GridLayout g1 = new GridLayout(4,5,10,20);
		setLayout(g1);
		add(t1);
		
		b0 = new Button("0");
		b0.setBackground(Color.PINK);
		b0.setForeground(Color.BLUE);
		
		b1 = new Button("1");
		b1.setBackground(Color.PINK);
		b1.setForeground(Color.BLUE);
		
		b2 = new Button("2");
		b2.setBackground(Color.PINK);
		b2.setForeground(Color.BLUE);
		
		b3 = new Button("3");
		b3.setBackground(Color.PINK);
		b3.setForeground(Color.BLUE);
		
		b4 = new Button("4");
		b4.setBackground(Color.PINK);
		b4.setForeground(Color.BLUE);
		
		b5 = new Button("5");
		b5.setBackground(Color.PINK);
		b5.setForeground(Color.BLUE);
		
		b6 = new Button("6");
		b6.setBackground(Color.PINK);
		b6.setForeground(Color.BLUE);
		
		b7 = new Button("7");
		b7.setBackground(Color.PINK);
		b7.setForeground(Color.BLUE);
		
		b8 = new Button("8");
		b8.setBackground(Color.PINK);
		b8.setForeground(Color.BLUE);
		
		b9 = new Button("9");
		b9.setBackground(Color.PINK);
		b9.setForeground(Color.BLUE);
		
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("x");
		div = new Button("/");
		mod = new Button("%");
		clear = new Button("CLEAR");
		EQ = new Button("=");
		t1.addActionListener(this);
		
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
		
		System.out.println("APPLET STARTED");
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		char ch = str.charAt(0);
		if(Character.isDigit(ch))
		{
			t1.setText(t1.getText()+str);
		}
		else 
		if(str.equals("+"))
		{
		
			v1 = Integer.parseInt(t1.getText());
			op = '+';
			t1.setText("");
		}
		else if(str.equals("-"))
		{
			v1 = Integer.parseInt(t1.getText());
			op = '-';
			t1.setText("");
		}
		else if(str.equals("x"))
		{
			v1 = Integer.parseInt(t1.getText());
			op = '*';
			t1.setText("");
		}
		else if(str.equals("/"))
		{
			v1 = Integer.parseInt(t1.getText());
			op = '/';
			t1.setText("");
		}
		else if(str.equals("%"))
		{
			v1 = Integer.parseInt(t1.getText());
			op = '%';
			t1.setText("");
		}
		  if(str.equals("="))
		  {
			  v2 = Integer.parseInt(t1.getText());
			  if(op=='+')
			  {
				  result = v1+v2;
			  }
			   else if(op=='-')
			   {
				   result = v1-v2;
			   }

               else if(op=='*')
			   {
				   result = v1*v2;
			   }
               else if(op=='/')
			   {
				   result = v1/v2;
			   }
			    else if(op=='%')
				   result = v1%v2;
			   t1.setText("" +result);
			
		    }
			   
			   
			   if(str.equals("CLEAR"))
		       {
			        t1.setText("");
		       }
        }
    }
	

 
			   
			   
			   
			   
				   
				   


/*
<html>
<body>
<applet code ="Calculator.class" width = 700 height=700 >
</applet>
</body>
</html>

*/








	
		
		
	