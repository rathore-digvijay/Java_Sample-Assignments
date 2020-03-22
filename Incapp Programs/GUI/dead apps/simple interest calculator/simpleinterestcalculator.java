import java.awt.*;
class simpleinterestcalculator extends Frame
{
  Button b1;
 TextField t1,t2,t3;
 Panel p1,p2,p3,p4;
 Label l1,l2,l3,l4,l5;
 simpleinterestcalculator(String s)
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
	  p3=new Panel();
	  p3.setBackground(Color.white);
	  p3.setBounds(50,200,200,200);
	  p3.setLayout(null);
	  add(p3);
	  p4=new Panel();
	  p4.setBackground(Color.white);
	  p4.setBounds(450,200,200,200);
	  p4.setLayout(null);
	  add(p4);
	  l1=new Label("Simple Interest Calculator");
	  l1.setBounds(250,45,200,30);
	  p1.add(l1);
	  l2=new Label("Principle");
	  l2.setBounds(50,40,100,20);
	  p3.add(l2);
	  l3=new Label("Rate");
	  l3.setBounds(50,100,100,20);
	  p3.add(l3);
	  l4=new Label("Time");
	  l4.setBounds(50,160,60,20);
	  p3.add(l4);
	  l5=new Label("..................");
	  l5.setBounds(250,30,90,20);
	  p2.add(l5);
	  t1=new TextField();
	  t1.setForeground(Color.blue);
	  t1.setBounds(25,50,100,20);
	  p4.add(t1);
	  t2=new TextField();
	  t2.setForeground(Color.blue);
	  t2.setBounds(25,100,100,20);
	  p4.add(t2);
	  t3=new TextField();
	  t3.setForeground(Color.blue);
	  t3.setBounds(25,160,100,20);
	  p4.add(t3);
	  b1=new Button("calculate");
	  b1.setBounds(30,20,100,50);
	  p2.add(b1);
	  
	  
	  }
	  
	  public static void main(String args[])
	  {
	  new simpleinterestcalculator("S.I. Calculator");
	  }
	  }