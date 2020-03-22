//find s2 in s1

class FindString1
{
     static boolean find(String s1, String s2) 
     { 
        char c1[]=s1.toCharArray();  
        char c[]=s2.toCharArray();

         for(int i=0;i<s1.length()-s2.length()+1;i++)
          {
              for(int j=0;j<s2.length();j++)
              {
                   if(c1[i+j]==c[j]) 
                   {
                      if(j==s2.length()-1)
                       {
                          return true;
                       }      
                   }
                   else{ break; }
  
              }
          }
              return false;        
     } 
    
     public static void main(String[] ar)
     {
        String s1="qspiders";
        String s2="qsp";
        System.out.println("\n"+"First String: "+s1+"\n"+"Second String: "+s2+"\n");   
        boolean b=find(s1,s2);                
          System.out.println(b);
     }
}