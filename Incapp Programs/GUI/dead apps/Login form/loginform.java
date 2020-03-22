import java.awt.*;
class loginform extends Frame
{
  Button b1,b2,b3,b4,b5;
 TextField t1,t2;
 Panel p1,p2;
 Label l1,l2,l3,l4;
 loginform(String s)
 {
	  super(s);
      setBackground(Color.white);               //f.setBackground(new Color(40,60,90));    
      setLayout(null);
	  setSize(700,600);
	  setVisible(true);
	  p1=new Panel();
	  p1.setBackground(Color.yellow);
	  p1.setBounds(40,10,600,100);
	  p1.setLayout(null);
	  add(p1);
	  p2=new Panel();
	  p2.setBackground(Color.green);
	  p2.setBounds(40,500,600,100);
	  p2.setLayout(null);
	  add(p2);
	  l1=new Label("Login Form");
	  l1.setBounds(250,45,100,30);
	  p1.add(l1);
	  l2=new Label("User ID:");
	  l2.setBounds(225,160,100,30);
	  add(l2);
	  l3=new Label("Password:");
	  l3.setBounds(225,210,100,30);
	  add(l3);
	  l4=new Label("====================================");
	  l4.setBounds(200,20,100,20);
	  p2.add(l4);
	  t1=new TextField("enter id");
	  t1.setForeground(Color.blue);
	  t1.setBounds(335,160,150,20);
	  add(t1);
	  t2=new TextField("secure code");
	  t2.setForeground(Color.blue);
	  t2.setBounds(335,210,150,20);
	  add(t2);
	  b1=new Button("Login");
	  b1.setBounds(227,260,60,30);
	  add(b1);
	  b2=new Button("Reset");
	  b2.setBounds(320,260,60,30);
	  add(b2);
	  
	  
	  }
	  
	  public static void main(String args[])
	  {
	  new loginform("Login_Form");
	  }
	  }