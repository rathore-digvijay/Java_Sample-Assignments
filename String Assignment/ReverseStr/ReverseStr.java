

class ReverseStr
{
    static int i=0,j=0;  

    static String reverse(String s)
     {  
       System.out.println("\n\nBefore Reverse String: "+s);
        char []ch1=new char[s.length()];
        char []ch=s.toCharArray();
        for(i=ch.length-1,j=0; i>=0 && j<ch1.length; i--,j++)
         {
              ch1[j]=ch[i];
         }
         
         String str=new String(ch1);
         return str;
     }

     public static void main(String []ar)
      {
         String str=reverse("MALAYALAM");
         System.out.println("\n\nAfter Reverse String: "+str);
      }
}