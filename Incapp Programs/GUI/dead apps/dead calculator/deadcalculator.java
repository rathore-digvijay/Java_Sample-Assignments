import java.awt.*;
class deadcalculator extends Frame
{
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
 TextField t1;
 Panel p;
 deadcalculator(String s)
 {
	  super(s);
      setBackground(Color.white);               //f.setBackground(new Color(40,60,90));    
      setLayout(null);
	  setSize(700,600);
	  setVisible(true);
	  p=new Panel();
	  p.setBackground(Color.yellow);
	  p.setBounds(40,40,530,100);
	  p.setLayout(null);
	  add(p);
	  t1=new TextField();
	  t1.setForeground(Color.blue);
	  t1.setBounds(30,10,300,40);
	  p.add(t1);
	  b1=new Button("clear");
	  b1.setBounds(350,40,100,20);
	  p.add(b1);
	  b2=new Button("7");
	  b2.setBounds(40,170,100,80);
	  add(b2);
	  b3=new Button("8");
	  b3.setBounds(170,170,100,80);
	  add(b3);
	  b4=new Button("9");
	  b4.setBounds(300,170,100,80);
	  add(b4);
	  b5=new Button("/");
	  b5.setBounds(450,170,100,80);
	  add(b5);
	  b6=new Button("4");
	  b6.setBounds(40,270,100,80);
	  add(b6);
	  b7=new Button("5");
	  b7.setBounds(170,270,100,80);
	  add(b7);
	  b8=new Button("6");
	  b8.setBounds(300,270,100,80);
	  add(b8);
	  b9=new Button("*");
	  b9.setBounds(450,270,100,80);
	  add(b9);
	  b10=new Button("1");
	  b10.setBounds(40,370,100,80);
	  add(b10);
	  b11=new Button("2");
	  b11.setBounds(170,370,100,50);
	  add(b11);
	  b12=new Button("3");
	  b12.setBounds(300,370,100,50);
	  add(b12);
	  b13=new Button("-");
	  b13.setBounds(450,370,100,50);
	  add(b13);
	  b14=new Button("0");
	  b14.setBounds(40,470,100,50);
	  add(b14);
	  b15=new Button("=");
	  b15.setBounds(170,470,230,50);
	  add(b15);
	  b16=new Button("+");
	  b16.setBounds(450,470,100,50);
	  add(b16);
	  
	  }
	  
	  public static void main(String args[])
	  {
	  new deadcalculator("Calculator");
	  }
	  }