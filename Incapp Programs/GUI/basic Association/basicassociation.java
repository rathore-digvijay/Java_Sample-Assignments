import java.awt.*;
class Dadu
{
   public static void main(String args[])
   {
		GUI g=new GUI();
		g.f.setVisible(true);
		}
}
		
		class GUI
		{
		 Frame f;
		 Button b;
		 TextField t;
		 Label l;
	    GUI()
		{
			f=new Frame("Mera pehla frame");
		//f.settitle("Mera pehla frame");
		//f.setVisible(true);
		f.setSize(400,300);
		f.setLayout(null);
		b=new Button("OK");
		b.setBounds(50,80,40,30);
		f.add(b);
		l=new Label("hello INCAPP");
		//l.setText("hello INCAPP");
		l.setBounds(70,130,80,20);
		f.add(l);
        t=new TextField();
        //textField t=new TextField("hi rahul");
        t.setBounds(50,170,100,20);
		f.add(t);
		}
		}
 