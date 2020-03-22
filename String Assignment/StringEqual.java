class StringEqual
{
     static boolean equal(String s1, String s2)
     { 
          int count=0;  
         for(int i=0,j=0; i<s1.length() && j<s2.length(); i++,j++)
         {
             if(s1.charAt(i)==s2.charAt(j))
              {
                  count++;
              }
         }
         if(count==s1.length())
          return true;
         else
           return false;
     }

     public static void main(String[] ar)
     {
         String s1="INDIA"; 
         String s2="INDIA";
         System.out.println("\n"+"First String: "+s1+"\n"+"Second String: "+s2+"\n");      
         boolean b=equal(s1,s2);
         System.out.println(b);      
     }
}