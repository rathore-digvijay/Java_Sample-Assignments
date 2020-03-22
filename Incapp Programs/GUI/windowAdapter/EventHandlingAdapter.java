import java.awt.*;
import java.awt.event.*;
class EventHandling extends WindowAdapter
{
Frame f;
EventHandling(String s)
{
  f=new Frame(s);
  f.addWindowListener(this);
  f.setLayout(null);
  f.setSize(400,400);
  f.setVisible(true);
 } 
 	public void windowClosing(WindowEvent e)
	{
	System.exit(0); 
     //f.dispose();
	}
	 	public void windowClosed(WindowEvent e)
	{
	//System.exit(0); 
	f.dispose();
	}
 }
  public class EventHandlingAdapter
  {
  public static void main(String args[])
  {
  new EventHandling("My Frame");
  }
  }