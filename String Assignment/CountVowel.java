class CountVowel
{
    static int countvowel(String s)
    { 
        int count=0;
        for(int i=0;i<s.length();i++)
         {
             char c=s.charAt(i);
      
             if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
              {
                 count++;
              }  
          }
         return count;
    }

    public static void main(String[] ar)
    {
       int  count=countvowel("Hello India");
       System.out.println("Total vowels in a string: "+count);
    }
}