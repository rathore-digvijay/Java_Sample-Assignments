class WordCount
{
    static int wordcount(String s)
    {
       int count=1;
      
      for(int i=0;i<s.length();i++)
       {
         if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
          {
              count++;  
          }
        }
       return count;
    }

    public static void main(String ar[])
    {
      int count=wordcount("This is a word count program");
      
      System.out.println("Total word in a string is: "+count);
    }
}