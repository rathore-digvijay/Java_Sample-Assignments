import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame
{
  Label l;
  MouseListenerExample(String title)
  {
     super(title);
     addMouseListener(new MouseHandler());
	 addMouseMotionListener(new MouseMotionHandler());
     l=new Label("Mouse Events");
     add(l);
     setSize(400,400);
     setVisible(true);
     setLayout(new FlowLayout());
  }
  class MouseHandler implements MouseListener
  {
       public void mouseClicked(MouseEvent e)
	   {
	     System.out.println("MouseClicked");
	   }
	   public void mousePressed(MouseEvent e)
	   {
	     System.out.println("MousePressed");
	   }
	   public void mouseReleased(MouseEvent e)
	   {
	     System.out.println("MouseReleased");
	   }
	   public void mouseEntered(MouseEvent e)
	   {
	     System.out.println("MouseEntered");
	   }
	   public void mouseExited(MouseEvent e)
	   {
	     System.out.println("MouseExited");
	   }
	    }
		class MouseMotionHandler implements MouseMotionListener
             {
			 public void mouseDragged(MouseEvent e)
			 {
			   System.out.println("Mouse Dragged");
			 }
			 public void mouseMoved(MouseEvent e)
			 {
			 System.out.println("Mouse moved");
			 }		
}
public static void main(String args[])
{
   new MouseListenerExample("Mouse Events Example");
} 
}