import java.awt.*;
class panel extends Frame
{
  Button b1,b2;
 Label l1,l2,l3,l4;
 TextField t1,t2;
 Panel p;
 panel(String s)
 {
	 super(s);
      setBackground(Color.gray);               //f.setBackground(new Color(40,60,90));    
      setLayout(null);
	  setSize(400,300);
	  setVisible(true);
	  l1=new Label("Mini Calculator");
	  l1.setForeground(Color.white);
	  l1.setBounds(150,60,100,20);
	  add(l1);
	  p=new Panel();
	  p.setBackground(Color.yellow);
	  p.setBounds(60,100,280,140);
	  add(p);
	  l2=new Label("Enter 1 no:");
	  l2.setBounds(50,20,80,20);
	  p.add(l2);
	  t1=new TextField();
	  t1.setForeground(Color.blue);
	  t1.setBounds(150,20,50,20);
	  p.add(t1);
	  l3=new Label("Enter 2 no:");
	  l3.setBounds(50,60,80,20);
	  p.add(l3);
	  t2=new TextField();
	  t2.setForeground(Color.blue);
	  t2.setBounds(150,60,50,20);
	  p.add(t2);
	  b1=new Button("+");
	  b1.setBounds(50,100,40,30);
	  p.add(b1);
	  b2=new Button("clear");
	  b2.setBounds(90,100,40,30);
	  p.add(b2);
	  l4=new Label("Answer=");
	  l4.setBounds(70,150,120,20);
	  p.add(l4);
	  }
	  
	  public static void main(String args[])
	  {
	  new panel("Mini Calculator");
	  }
	  }