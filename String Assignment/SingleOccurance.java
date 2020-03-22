class SingleOccurance
{
    static String singleoccur(String str)
    {
      char c,ch;
      int count;

      StringBuffer sb=new StringBuffer();
       
             count=0;
             for(int j=0; j<str.length(); j++)
             {
                 c=str.charAt(j);
     
                 if(j==str.length()-1)
                 {
                   ch=' ';
                 }
                 else 
                 ch=str.charAt(j+1);
          
                 if(ch==c)
                 {
                    count++;
                 }
                 else
                 {
                   sb.append(c);
                 }
              }
             
         
         String s=sb.toString();
         return s;       
     }

     public static void main(String[] ar)
    { 
       String s="  RRaamm";
       System.out.println("\n\nBefore Single Occurance String is: "+s+"\n");
       
       String str=singleoccur(s); 
       System.out.println("After Single Occurance String is: "+str);       
    }
}  