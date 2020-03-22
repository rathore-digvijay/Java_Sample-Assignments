import java.util.Scanner;

public class Test {
	Scanner scan = new Scanner(System.in);
	String choice = scan.next();
	Pen p = PenFactory.getPen(choice);
	//Pen p = PenFactory.getPen(scan.next());
	if(p!=null)
	{
		p.write();
	}
}