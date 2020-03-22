class LengthStr1
{
   public static void main(String[] ar)
    {
       int  len=0;
       String s="Hello India";

       for(char c:s.toCharArray())
        {
           len++;
        }
       System.out.println("Length of string: "+len);   
    }
}     