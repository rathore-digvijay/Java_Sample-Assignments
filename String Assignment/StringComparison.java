
class StringComparison
{
     static int compare(String s1, String s2)
     {
         int i=0,j=0;

         char ch[]=s1.toCharArray();
         char ch1[]=s2.toCharArray();

         while(i<s1.length() && j<s2.length())
          {
              if(ch[i]==ch1[j])
              {
                 i++; 
                 j++;
              }
             else if(ch[i]>ch1[j]) 
             {
                  return 1;
             }
            else
            {
                return -1;    
             }
         }

         if(ch.length==ch1.length)
          { return 0; }
        else if(ch.length<ch1.length)
          { return -1; }

       return 1;              
     }

      public static void main(String[] ar)
      {
         String s1="india";
         String s2="india"; 

          int x=compare(s1,s2);

         System.out.println(x);
      }
}