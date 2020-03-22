class LengthStr
{
    static int Length(String s)
    { 
        int len=0;

        char ac[]=s.toCharArray();

       try
       {
               for(int i=0; ac[i]!='\0' ;i++)
              {
                 len++;
              }
       }
      catch(Exception e){}
         return len;
    }

    public static void main(String[] ar)
    {
       int  len=Length("Hello India");
       System.out.println("Length of string: "+len);
    }
}