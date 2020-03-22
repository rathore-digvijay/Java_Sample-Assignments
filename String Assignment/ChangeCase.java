
class ChangeCase
{
    static String changecase(String str)
    {
        char ch;
        StringBuffer sb=new StringBuffer();

            for(int j=0; j<str.length(); j++)
            {
                ch=str.charAt(j);
                int b=(int)ch;
               
                if(b==32)//[we have to write this otherwise @ symbol will show in output] we must be written if condition min to max(Output will proper), must not write max to min(Output will be shown improper)
                 {
                    b=32;
                 } 
               else if(b==65 || ch<=90)
                 {
                    b=b+32;
                 }
                else if(b==97 || ch<=122)
                 {
                    b=b-32; 
                 }
                
                 sb.append((char)b);                 
             }
   
          String s=sb.toString();
          return(s);  
     }

    public static void main(String[] ar)
    { 
       String s="InDiA Is A Greate COUNTRY";
       System.out.println("\n\nBefore ChangeCase String is: "+s+"\n");
       
       String str=changecase(s); 
       System.out.println("After ChangeCase String is: "+str);       
    }
} 