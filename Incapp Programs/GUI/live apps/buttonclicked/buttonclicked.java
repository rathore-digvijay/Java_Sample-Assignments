import java.awt.*;
import java.awt.event.*;
class buttonclicked extends Frame implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{	
		      try{
					  String s=l2.getText();
					  int n= Integer.parseInt(s);
					  n++;
						l2.setText(String.valueOf(n));
						//l4.setText(n+"");
					}
				catch(Exception re)
				{
						l2.setText(re.getMessage());
		        }
			}
		    else
			    {
			    try{
					l2.setText("0");
				}
				catch(Exception re)
				{
					l2.setText(re.getMessage());
				}
			}
		}
  Button b1,b2;
 Panel p1,p2;
 Label l1,l2;
 buttonclicked(String s)
 {
	  super(s);
      setBackground(Color.red);               //f.setBackground(new Color(40,60,90));    
      setLayout(null);
	  setSize(700,600);
	  setVisible(true);
	  p1=new Panel();
	  p1.setBackground(Color.yellow);
	  p1.setBounds(40,100,200,250);
	  p1.setLayout(null);
	  add(p1);
	  p2=new Panel();
	  p2.setBackground(Color.green);
	  p2.setBounds(350,100,200,250);
	  p2.setLayout(null);
	  add(p2);
	  l1=new Label("Button clicked");
	  l1.setBounds(30,40,80,30);
	  p2.add(l1);
	  l2=new Label("0");
	  l2.setBounds(70,100,60,20);
	  p2.add(l2);
	  b1=new Button("Click Me");
	  b1.setBounds(30,30,80,30);
	  p1.add(b1);
	  b1.addActionListener(this);
	  
	  b2=new Button("Reset");
	  b2.setBounds(30,100,80,30);
	 p1.add(b2);
	  b2.addActionListener(this);
	 
	  }
      public static void main(String args[])
	  {
	  new buttonclicked("click test");
	  }
	  }