class Triangle1
{
   static void triangle1(String s1) 
   {
       for(int i=0; i<s1.length(); i++)
       {
          for(int j=0; j<=i; j++)
          {  
             System.out.print(s1.charAt(j));
          }
          System.out.println();
       }  
   } 

  public static void main(String[] ar)
    {
        triangle1("jspiders");
    }
}