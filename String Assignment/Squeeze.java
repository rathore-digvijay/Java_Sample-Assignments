// Remove all spaces from string(convert whole string into one word)

class Squeeze
{ 
   static String Squeeze(String str) 
   {
      StringBuffer sb=new StringBuffer();     
 
      for(int i=0; i<str.length(); i++)
          {
            char c=str.charAt(i);
              
             if(c==' ')
                  {}
              else
                sb.append(c);
           }
   
        String s=sb.toString();
        return(s);
   }
  
   public static void main(String[] ar)
   {
      String s="  I Love My India  ";
      System.out.println("Before Squeeze String is:\n"+s);
      System.out.println("Length of String: "+s.length());

      String str=Squeeze(s);
      System.out.println("\nAfter Squeeze String is:\n"+str);
      System.out.println("Length of String: "+str.length());
   }
}