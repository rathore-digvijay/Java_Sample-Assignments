import java.awt.*;
class deadminicalculator extends Frame
{
  Button b1,b2,b3,b4,b5;
 TextField t1,t2;
 Panel p1,p2;
 Label l1,l2,l3,l4,l5;
 deadminicalculator(String s)
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
	  l1=new Label("Mini Calculator");
	  l1.setBounds(250,45,100,30);
	  p1.add(l1);
	  l2=new Label("Enter Ist no:");
	  l2.setBounds(225,160,100,30);
	  add(l2);
	  l3=new Label("Enter 2nd no:");
	  l3.setBounds(225,210,100,30);
	  add(l3);
	  l4=new Label("Answer:");
	  l4.setBounds(40,20,60,20);
	  p2.add(l4);
	  l5=new Label("..................");
	  l5.setBounds(120,30,90,20);
	  p2.add(l5);
	  t1=new TextField();
	  t1.setForeground(Color.blue);
	  t1.setBounds(335,160,60,20);
	  add(t1);
	  t2=new TextField();
	  t2.setForeground(Color.blue);
	  t2.setBounds(335,210,60,20);
	  add(t2);
	  b1=new Button("+");
	  b1.setBounds(227,260,35,30);
	  add(b1);
	  b2=new Button("-");
	  b2.setBounds(267,260,35,30);
	  add(b2);
	  b3=new Button("/");
	  b3.setBounds(307,260,35,30);
	  add(b3);
	  b4=new Button("*");
	  b4.setBounds(347,260,35,30);
	  add(b4);
	  b5=new Button("%");
	  b5.setBounds(387,260,35,30);
	  add(b5);
	  
	  }
	  
	  public static void main(String args[])
	  {
	  new deadminicalculator("Mini Calculator");
	  }
	  }