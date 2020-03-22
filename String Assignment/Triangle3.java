class Triangle3
{
   static void triangle3(String s1) 
   {
       for(int i=0; i<s1.length(); i++)
       { 
          for(int k=0; k<i; k++)
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
        triangle3("jspiders");
    }
}