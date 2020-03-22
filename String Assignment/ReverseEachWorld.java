class ReverseEachWorld
{
   public void reverseEachWorld(String s)
   {
       String str[]=s.split(" ");
	   String str1="";
	   
	   for(String str2:str)
	   {
	       for(int i=str2.length()-1; i>=0; i--)
		   {
		      str1+=str2.charAt(i);
		   }
		   str1+=" ";
	   }
	   
	   System.out.println(str1);
   }
   
   public static void main(String ar[])
   {
      ReverseEachWorld r=new ReverseEachWorld();
	  r.reverseEachWorld("I am a good boy");
   }
}