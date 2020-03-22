class PrintAllWorldInReverse
{
   public void printAllWorld(String s)
   {
        String str="";       
	   
	       for(int i=s.length()-1; i>=0; i--)
		   {
		      str+=s.charAt(i);
		   }
	   
	   System.out.println(str);
   }
   
   public static void main(String ar[])
   {
      PrintAllWorldInReverse p=new PrintAllWorldInReverse();
	  p.printAllWorld("I am a good boy");
   }
}