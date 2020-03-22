
class FrequencyCount
{
    static void freqCount(String str)
    {
        int j,count;
        char c,ch;

       System.out.println("\n   Letter"+"          Frequency\n");       

       for(c='A'; c<='z'; c++)
       {
            count=0;
            for(j=0; j<str.length(); j++)
            {
                ch=str.charAt(j);
                if(ch==c)
                {
                   count++;
                }
             }
             if(count>0)
             {
               System.out.println("     "+c+"                "+count);              
             }
        }
     }

    public static void main(String[] ar)
    {
       freqCount("Helloo");        
    }
} 