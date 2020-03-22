

class PalindromeStr
{
    static int i=0,j=0;  

    static boolean palindrome(String s)
     {       
        char []ch1=new char[s.length()];
        char []ch=s.toCharArray();
        for(i=ch.length-1,j=0; i>=0 && j<ch1.length; i--,j++)
         {
              ch1[j]=ch[i];
         }
         
         String str=new String(ch1);
                
         if(s.equals(str))
           return true; // we can't write here 'True'    

         else
           return false;
       
     }

     public static void main(String []ar)
      {
         boolean b=palindrome("MALAYALAM");

         System.out.println(b);        
      }
}