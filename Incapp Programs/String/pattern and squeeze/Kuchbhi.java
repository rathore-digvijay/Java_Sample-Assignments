public class Kuchbhi
{
  public static void main(String args[])
  {
    String s="hello Incapp";
    print1(s);
	 print2(s);
	  print3(s);
    String ns=squeeze("     I Love My India            ");
	System.out.println("new String="+ns);
	}
	static void print1(String s)
	{
	  for(int x=0;x<s.length();x++)
	  {
	     for(int y=0;y<(s.length()-x);y++)
		  {
		    System.out.print(s.charAt(y));
		   }
		   System.out.println();
		   }
		  }
		  static void print2(String s)
	{
	  for(int x=0;x<s.length();x++)
	  {
	     for(int y=0;y<=x;y++)
		  {
		    System.out.print(s.charAt(y));
		   }
		   System.out.println();
		   }
		  }
		  static void print3(String s)
	{
	  for(int x=0;x<s.length();x++)
	  {
	       for(int y=0;y<x;y++)
		  {
		    System.out.print(" ");
		  }
			for(int z=x;z<s.length();z++)
			{
			   System.out.print(s.charAt(z));
			}
		   System.out.println();
		   }
		  }
		  
		 static String squeeze(String s)
		 {
		 String n="";
		 for(int x=0;x<s.length();x++)
		 {
		   if(s.charAt(x)!=32)
		   {
		      n=n+s.charAt(x);
		   }
		 }
             return n;	
	}
	}
	
	
  