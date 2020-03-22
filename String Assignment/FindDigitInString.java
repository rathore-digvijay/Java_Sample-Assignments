class FindDigitInString
{
 
     boolean fdigitinStr(String str)
       {
           int count=0;
           for(char c:str.toCharArray())
            { 
               if(Character.isDigit(c))
                {
                    count++;                     
                 }
             }
             if(count>0)
               return true;
             else
                return false;
        }
          
     public static void main(String[] ar)
     {
        String s="Ram io";
        FindDigitInString fdis=new FindDigitInString();
        boolean b=fdis.fdigitinStr(s);
       System.out.println("\n"+b);                              
      }
}