class ReverseStr2
{
   static String reverse(String str)
   {
      char ch[]=new char[str.length()];
        
          for(int i=str.length()-1,j=0; i>=0&&j<ch.length; i--,j++)
         {
            ch[j]=str.charAt(i);
         }
         String s=new String(ch);
         return(s);
   }
   
    public static void main(String[] ar)
    {
        String s="Welcome to India";
        System.out.print("\nBefore Reverse String is: "+s);
        String str=reverse(s);
        System.out.print("\n\nAfter Reverse String is: "+str+"\n");
     }
}