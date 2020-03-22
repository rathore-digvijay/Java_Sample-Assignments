class SpaceCount
{
    static int spaceCount(String s)
    {
       int count=0;
      
      for(int i=0;i<s.length(); i++)
       {
         if(s.charAt(i)==' ')
          {
              count++;  
          }
        }
       return count;
    }

    public static void main(String ar[])
    {
      int count=spaceCount("This is a space count program");
      
      System.out.println("Total space in a string is: "+count);
    }
}