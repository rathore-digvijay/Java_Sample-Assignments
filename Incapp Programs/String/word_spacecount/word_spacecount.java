public class word_spacecount
{
  public static void main(String args[])
  {
  String s="my name iz khan";
  int n=wcount(s);
  int m=scount(s);
  System.out.println("space count="+n);
  System.out.println("word count="+m);
  System.out.println("string="+s);
  }
 
 static int wcount(String s)
 {
 int wcount=0;
  for(int x=0;x<s.length();x++)
		 {
		   if(s.charAt(x)==32)
		   {
		      wcount++;
		   }
		 }
		 return wcount;
		
		 }
		 
		 static int scount(String s)
 {
 int scount=0;
  for(int x=0;x<s.length();x++)
		 {
		   if(s.charAt(x)==32)
		   {
		      scount++;
		   }
		 }
		 return scount+1;
		
		 }
		 }