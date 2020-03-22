import java.awt.*;
import java.awt.event.*;
class awt_addComponent
{
	  public static void main(String args[])
	  {
	  new Gui("Mini Calculator");
	  }
}  
class Gui extends Frame implements ActionListener
	{
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{	
		      try
				  {
						String s1=t1.getText();
						String s2=t2.getText();
						int n1= Integer.parseInt(s1);
						int n2 =Integer.parseInt(s2);
						int n=n1+n2;
						//l4.setText(String.valueOf(n));
						l4.setText(n+"");
				  }
				catch(Exception re)
				{
						l4.setText(re.getMessage());
				}
			}
		    else
			    {
			    try
				    {
						String s1=t1.getText();
						String s2=t2.getText();
						int n1= Integer.parseInt(s1);
						int n2 =Integer.parseInt(s2);
						int n=n1-n2;
						l4.setText(String.valueOf(n));
						//l4.setText(n+"");
					}
				catch(Exception re)
				{
						l4.setText(re.getMessage());
		        }
			}
		}
Button b1,b2;
Label l1,l2,l3,l4;
TextField t1,t2;


Gui(String s)
     {
        super(s);
      setBackground(Color.white);
      setLayout(null);
	  setSize(700,600);
	  setVisible(true);

      t1=new TextField();
	  t1.setBackground(Color.red);
	  t1.setBounds(200,40,100,20);
	  add(t1);
	  
     t2=new TextField();
	  t2.setBackground(Color.red);
	  t2.setBounds(200,100,100,20);
	  add(t2);
	  

        l1=new Label("Enter the first number");
		l1.setBounds(50,40,120,25);
	   add(l1);
	  

       l2=new Label("Enter the 2nd number");
	  l2.setBounds(50,100,120,25);
	  add(l2);
	  
	   l3=new Label("Answer is--");
	  l3.setBounds(50,250,80,20);
	  add(l3);
	  
	   l4=new Label("_________");
	  l4.setBounds(140,250,300,30);
	  add(l4);
	  
	  b1=new Button("+");
	  b1.setBounds(60,150,40,30);
	  add(b1);
	  b1.addActionListener(this);
	  b2=new Button("-"); 
	  b2.setBounds(110,150 ,40,30);
	  add(b2); 
	 b2.addActionListener(this);
	 		}
		}