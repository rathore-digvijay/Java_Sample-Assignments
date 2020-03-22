class CountDigitInString
{
 
     int CDigitinStr(String str)
       {
           int count=0;
           for(char c:str.toCharArray())
            { 
               if(c=='\u0030' || c<='\u0039')
                {
                    count++;                     
                 }
             }
            
            return count;
        }
          
     public static void main(String[] ar)
     {
        String s="Ram1450";
        CountDigitInString cdis=new CountDigitInString();
        int i=cdis.CDigitinStr(s);
       System.out.println("\n"+"Number of digits in a string: "+i);                              
      }
}