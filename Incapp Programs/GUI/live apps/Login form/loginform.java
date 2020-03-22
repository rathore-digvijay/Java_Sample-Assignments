import java.awt.*;
import java.awt.event.*;
class loginform extends WindowAdapter implements ActionListener
{
	 public void windowClosing(WindowEvent e)
	{
	//System.exit(0); 
     f.dispose();
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try
			{
				String s1=t1.getText();
				String s2=t2.getText();
				String s3="anshulmishra96@gmail.com";
				String s4="mishra";
				if(s1.equals(s3)&&s2.equals(s4))
				{
					l4.setText("Login Success");
				}
				else{
					l4.setText("Login Failed");
				}
			}
			catch(Exception e)
			{
				l4.setText(e.getMessage());
			}
		}
		else{
			try{
				t1.setText("enter id");
				t2.setText("secure code");
				l4.setText("==============================");
			}
			catch(Exception e)
			{
				l4.setText(e.getMessage());
			}
		}
	}
		
	Frame f;
  Button b1,b2;
 TextField t1,t2;
 Panel p1,p2;
 Label l1,l2,l3,l4;
 loginform(String s)
 {
       f=new Frame(s);	
      f.setBackground(Color.white); 	  //f.setBackground(new Color(40,60,90));    
      f.setLayout(null);
	  f.addWindowListener(this);
	  f.setSize(700,600);
	  f.setVisible(true);
	  p1=new Panel();
	  p1.setBackground(Color.yellow);
	  p1.setBounds(40,10,600,100);
	  p1.setLayout(null);
	  f.add(p1);
	  p2=new Panel();
	  p2.setBackground(Color.green);
	  p2.setBounds(40,500,600,100);
	  p2.setLayout(null);
	  f.add(p2);
	  l1=new Label("Login Form");
	  l1.setBounds(250,45,100,30);
	  p1.add(l1);
	  l2=new Label("User ID:");
	  l2.setBounds(225,160,100,30);
	  f.add(l2);
	  l3=new Label("Password:");
	  l3.setBounds(225,210,100,30);
	  f.add(l3);
	  l4=new Label("====================================");
	  l4.setBounds(200,20,200,20);
	  p2.add(l4);
	  t1=new TextField("enter id");
	  t1.setForeground(Color.blue);
	  t1.setBounds(335,160,150,20);
	  f.add(t1);
	  t2=new TextField("secure code");
	  t2.setForeground(Color.blue);
	  t2.setBounds(335,210,150,20);
	  f.add(t2);
	  b1=new Button("Login");
	  b1.setBounds(227,260,60,30);
	  f.add(b1);
	  b1.addActionListener(this);
	  b2=new Button("Reset");
	  b2.setBounds(320,260,60,30);
	  f.add(b2);
	  b2.addActionListener(this);
	  
	  }
	 
	  
	  public static void main(String args[])
	  {
	  new loginform("Login Form");
	  }
	  }