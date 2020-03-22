public class char_vowelcount
{
  public static void main(String args[])
  {
  String s="my name iz khan";
  int n=chcount(s);
  int m=vcount(s);
  System.out.println("character count="+n);
  System.out.println("vowel count="+m);
  System.out.println("string="+s);
  }
 
 static int chcount(String s)
 {
 int chcount=0;
  for(int x=0;x<s.length();x++)
		 {
		   if(s.charAt(x)!=32)
		   {
		      chcount++;
		   }
		 }
		 return chcount;
		
		 }
		 
		 static int vcount(String s)
 {
 int vcount=0;
  for(int x=0;x<s.length();x++)
		 {
		   if(s.charAt(x)==65||s.charAt(x)==69||s.charAt(x)==73||s.charAt(x)==79||s.charAt(x)==85||s.charAt(x)==97||s.charAt(x)==101||s.charAt(x)==105||s.charAt(x)==111||s.charAt(x)==117)
		   {		     
				vcount++;
		   }
		 }
		 return vcount;
		 }
}
		 