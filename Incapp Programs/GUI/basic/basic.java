import java.awt.*;
class Dadu
{
   public static void main(String args[])
   {
		Frame f=new Frame("Mera pehla frame");
		//f.setTitle("Mera pehla frame");
		f.setVisible(true);
		f.setSize(400,300);
		f.setLayout(null);
		Button b=new Button("OK");
		b.setBounds(50,80,40,30);
		f.add(b);
		Label l=new Label("hello INCAPP");
		//l.setText("hello INCAPP");
		l.setBounds(70,130,80,20);
		f.add(l);
        TextField t=new TextField();
        //textField t=new TextField("hi rahul");
        t.setBounds(50,170,100,20);
		f.add(t);
		}
 }