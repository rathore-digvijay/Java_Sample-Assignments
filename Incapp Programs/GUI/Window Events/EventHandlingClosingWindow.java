import java.awt.*;
import java.awt.event.*;
class EventHandling
{
Frame f;
Button b;
TextField t;
EventHandling(String s)
{
  f=new Frame(s);
  t=new TextField();
  t.setBounds(40,40,40,20);
  f.add(t);
  b=new Button("OK");
  b.setBounds(40,120,40,20);
  f.add(b);
  Demo d=new Demo();
  t.addActionListener(d);
  b.addActionListener(d);
  f.addWindowListener(d);
  f.setLayout(null);
  f.setSize(400,400);
  f.setVisible(true);
 } 
 class Demo implements ActionListener,WindowListener
 {
    public void actionPerformed(ActionEvent e) 
	{
	t.setText("Hello");
	}
	public void windowClosed(WindowEvent e)
	{
	System.out.println("Window closed");
	}
	public void windowIconified(WindowEvent e)
	{
	System.out.println("Window Iconified");
	}
	public void windowOpened(WindowEvent e)
	{
	System.out.println("Window Opened");
	}
	public void windowDeiconified(WindowEvent e)
	{
	System.out.println("Window Deiconified");
	}
	public void windowActivated(WindowEvent e)
	{
	System.out.println("Window Activated");
	}
	public void windowDeactivated(WindowEvent e)
	{
	System.out.println("Window deactivated");
	}
	public void windowClosing(WindowEvent e)
	{
	//System.exit(0); 
	f.dispose();
	}
 }
  }
  public class EventHandlingClosingWindow
  {
  public static void main(String args[])
  {
  new EventHandling("My Frame");
  }
  }