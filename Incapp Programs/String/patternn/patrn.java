class Kuchbhi
{
	static int k;
  public static void main(String args[])
  {
    String s="INCAPP";
    print(s);
    }
	static void print(String s)
	{
	  for(int x=0;x<s.length();x++)
	  {
          for(int y=0;y<(s.length()-x);y++)
		  {
		  System.out.print(s.charAt(y));
		  }
		  for(int z=0;z<x;z++)
		  {
		  	System.out.print(" ");
		  }
		for(k=0;k<x;k++)
		{
				  	System.out.print(" ");

		}
			for(int l=k;l<s.length();l++)
			{
		   System.out.print(s.charAt(l));
		    }
			System.out.println();
		    }
	}
}

							
		  