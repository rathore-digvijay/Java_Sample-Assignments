//Character count without space

class CharCount
{
    static int charcount(String s)
    {
       int count=0;
      
      for(int i=0;i<s.length();i++)
       {
         if(s.charAt(i)!=' ')
          {
              count++;  
          }
        }
       return count;
    }

    public static void main(String ar[])
    {
      int count=charcount("This is a word count program");
      
      System.out.println("Total character in a string is: "+count);
    }
}