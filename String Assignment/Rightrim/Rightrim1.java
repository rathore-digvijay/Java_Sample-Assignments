//very short way to remove right spaces 

class Rightrim1
{
    static String Ltrim(String str)
    {
       int i=0; char c='a'; 

       StringBuffer buff=new StringBuffer();
       StringBuffer buff1=new StringBuffer();
    
       for(i=str.length()-1;i>=0;i--)
         {
             c=str.charAt(i);
            
            if(c==' ')
                 buff.append(c); 
             else
               break;
          }

           for(int j=0; j<=i; j++)
           { 
              c=str.charAt(j);
              buff1.append(c);              
           }
           
           String temp=buff1.toString();     
        return(temp);
    } 
     
     public static void main(String[] ar)
     {
        String s="   This is a string containing   ";
        
        System.out.println("\nBefore left trim String is:"+"\n"+s);               
        System.out.println("Length of String: "+s.length());    
        
          String str=Ltrim(s);
        
           System.out.println("\n\nAfter left trim String is:"+"\n"+str);          
           System.out.println("Length of String: "+str.length());
     }
}