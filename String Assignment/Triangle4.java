class Triangle4
{
   static void triangle4(String s1) 
   {
       for(int i=s1.length()-1; i>=0; i--)
       {
            for(int j=0; j<=i; j++)
            {  
               System.out.print(s1.charAt(j));    
            }
            for(int k=s1.length()-1; k>0; k--)
            {
              System.out.print(" ");
             }
 
            for(int k=i; k<=2i; k++)
           {System.out.print(" ");}  
            for(int j=i; j<s1.length(); j++)
            {  
               System.out.print(s1.charAt(j));
            }

            System.out.println();
        }
 
     } 


  public static void main(String[] ar)
    {
        triangle4("jspiders");
    }
}