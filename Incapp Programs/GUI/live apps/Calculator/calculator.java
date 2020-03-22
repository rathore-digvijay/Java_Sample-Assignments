import java.awt.*;
import java.awt.event.*;
public class calculator extends WindowAdapter implements ActionListener
{
	String x,z;
	int y,c;
 Frame f;
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
 TextField t1;
 Panel p;
 
 
 
calculator()
       {    
      f=new Frame("Calculator");
      f.setBackground(Color.white);               //f.setBackground(new Color(40,60,90));    
      f.setLayout(null);
	  f.setSize(700,600);
	  f.setVisible(true);
	  f.addWindowListener(this);
	  p=new Panel();
	  p.setBackground(Color.yellow);
	  p.setBounds(40,40,530,100);
	  p.setLayout(null);
	  f.add(p);
	  t1=new TextField("");
	  t1.setForeground(Color.blue);
	  t1.setBounds(30,10,300,40);
	  p.add(t1);
	  b1=new Button("clear");
	  b1.setBounds(350,40,100,20);
	  p.add(b1);
	  b1.addActionListener(this);
	  b2=new Button("7");
	  b2.setBounds(40,170,100,80);
	  f.add(b2);
	  b2.addActionListener(this);
	  b3=new Button("8");
	  b3.setBounds(170,170,100,80);
	  f.add(b3);
	  b3.addActionListener(this);
	  b4=new Button("9");
	  b4.setBounds(300,170,100,80);
	  f.add(b4);
	  b4.addActionListener(this);
	  b5=new Button("/");
	  b5.setBounds(450,170,100,80);
	  f.add(b5);
	  b5.addActionListener(this);
	  b6=new Button("4");
	  b6.setBounds(40,270,100,80);
	  f.add(b6);
	  b6.addActionListener(this);
	  b7=new Button("5");
	  b7.setBounds(170,270,100,80);
	  f.add(b7);
	  b7.addActionListener(this);
	  b8=new Button("6");
	  b8.setBounds(300,270,100,80);
	  f.add(b8);
	  b8.addActionListener(this);
	  b9=new Button("*");
	  b9.setBounds(450,270,100,80);
	  f.add(b9);
	  b9.addActionListener(this);
	  b10=new Button("1");
	  b10.setBounds(40,370,100,80);
	  f.add(b10);
	  b10.addActionListener(this);
	  b11=new Button("2");
	  b11.setBounds(170,370,100,50);
	  f.add(b11);
	  b11.addActionListener(this);
	  b12=new Button("3");
	  b12.setBounds(300,370,100,50);
	  f.add(b12);
	  b12.addActionListener(this);
	  b13=new Button("-");
	  b13.setBounds(450,370,100,50);
	  f.add(b13);
	  b13.addActionListener(this);
	  b14=new Button("0");
	  b14.setBounds(40,470,100,50);
	  f.add(b14);
	  b14.addActionListener(this);
	  b15=new Button("=");
	  b15.setBounds(170,470,230,50);
	  f.add(b15);
	  b15.addActionListener(this);
	  b16=new Button("+");
	  b16.setBounds(450,470,100,50);
	  f.add(b16);
	  b16.addActionListener(this);
	  
	  }
		
	  public static void main(String args[])
	  {
	  new calculator();
	  }
	 
	
	public void windowClosing(WindowEvent e)
	{
	//System.exit(0); 
     f.dispose();
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b2)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="7";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
				{
						
				}
			}
			if(ae.getSource()==b3)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="8";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b4)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="9";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b6)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="4";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b7)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="5";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}}
		    if(ae.getSource()==b8)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="6";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b10)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="1";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b11)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="2";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b12)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="3";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							
							t1.setText(s2);
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b14)
			{	
		      try
				  {
						String s1=t1.getText();							//int n1= Integer.parseInt(s1);
						String s2 ="0";
						if(s1.equals("/")||s1.equals("*")||s1.equals("-")||s1.equals("+"))    
						{
							t1.setText(s2);
							
						}	
						else
						{
						String s3=s1.concat(s2);
						t1.setText(s3);
						
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b5)
			{	
		      try
				  {
						x=t1.getText();							//int n1= Integer.parseInt(s1);
						t1.setText("/");
						String s1=t1.getText();
						y=0;
						String s2 ="/";
											
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  
				catch(Exception re)
			{}}
			if(ae.getSource()==b9)
			{	
		      try
				  {
						x=t1.getText();							//int n1= Integer.parseInt(s1);
						t1.setText("*");
						String s1=t1.getText();
						y=1;
						String s2 ="*";
											
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				  
				catch(Exception re)
			{}}
			if(ae.getSource()==b13)
			{	
		      try
				  {
						x=t1.getText();							//int n1= Integer.parseInt(s1);
						t1.setText("-");
						String s1=t1.getText();
						y=2;
						String s2 ="-";
											
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b16)
			{	
		      try
				  {
						x=t1.getText();							//int n1= Integer.parseInt(s1);
						t1.setText("+");
						String s1=t1.getText();
						y=3;
						String s2 ="+";
											
						//l4.setText(String.valueOf(n));
						//l4.setText(n+"");
				  
				  }
				catch(Exception re)
			{}}
			if(ae.getSource()==b15)
			{	
		      try
				  {
					  Float n;
					  z=t1.getText();
					 Float n1=Float.parseFloat(x);
					 	 Float n2=Float.parseFloat(z);
						  if(y==0)
						 {
							  n=n1/n2;
							 t1.setText(String.valueOf(n));
						 }
						 else if(y==1)
							 {
						       n=n1*n2;
							 t1.setText(String.valueOf(n));
							 }
							 else if(y==2)
								 {
									 			n=n1-n2;
							                     t1.setText(String.valueOf(n));
								 }
								 else
								 {
								   n=n1+n2;
							       t1.setText(String.valueOf(n));
							     }
							 }
						 
						catch(Exception re)
			{
				t1.setText(re.getMessage());
			}}
			if(ae.getSource()==b1)
			{	
		try{
			      t1.setText("");
			}
			catch(Exception e)
			{}}
  }
}

	  

	  