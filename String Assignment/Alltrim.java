// Remove spaces from Left and Right

class Alltrim
{
    static String alltrim(String s)
    {
       String str=Leftrim.Ltrim(s);
       String str1=Rightrim.Rtrim(str);

        return(str1);
    }

     public static void main(String[] ar)
      {
         String s="   India is a great country   ";
         System.out.println("\nBefore all trim String is: "+s);
         System.out.println(s.length());

         s=alltrim(s);
         System.out.println("\n\nAfter all trim String is: "+s);
         System.out.println(s.length());
      }
}