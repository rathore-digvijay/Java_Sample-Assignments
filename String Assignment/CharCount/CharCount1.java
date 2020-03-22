//Character count without space and without chatAt(), try later

class CharCount1
{
    static int charcount(String s)
    {
       char ch[]=s.toCharArray();
       int count=0;
      
      for(int i=0;i<ch.length;i++)
       {
         if(ch[i]!=' ')
          {
              count++;  
          }
        }
       return count;
    }

    public static void main(String ar[])
    {
      int count=charcount("This is a word count program");
      
      System.out.println("Total word in a string is: "+count);
    }
}