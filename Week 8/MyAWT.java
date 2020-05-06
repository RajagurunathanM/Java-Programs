import java.awt.*;

class MyAWT extends Frame
{

MyAWT()
{
setSize(700,700);
setBackground(Color.PINK);
setLayout(null);
setVisible(true);

Label welcome = new Label("WELCOME TO FEEDBACK SYSTEM");
welcome.setBounds(300,10,200,200);
add(welcome);
welcome.setForeground(Color.BLUE);

Label Name = new Label("NAME  : ");
Name.setBounds(30,150,100,100);
add(Name);
Name.setForeground(Color.BLUE);

TextField t1 = new TextField("RAJAGURUNATHAN");
t1.setBounds(30,200,200,30);
t1.setBackground(Color.GREEN);
t1.setForeground(Color.BLUE);
add(t1);



}

public static void main(String args[])
{
MyAWT obj = new MyAWT();
}
}