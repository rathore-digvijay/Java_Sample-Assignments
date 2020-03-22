
public class PenFactory {

	public static Pen getPen(String choice)
	{
		if(choice.equalsIgnoreCase("Marker"))
		{
			Marker m = new Marker();
			return m;
		}
		if(choice.equalsIgnoreCase("InkPen"))
		{
			InkPen ip = new InkPen();
			return ip;
		}
		else{
			return null;
		}
	}
}
