
class PrintNonRepeatingFirstChar
{
     void PNonReFChar(String str)
    {
        char process[]=str.toCharArray();
        boolean status=false;
      
        int index=0;
        for(int i=0; i<process.length; i++)
          {
               for(int j=0; j<process.length; j++)
                  {
                        if(i==j)
                          continue;
                        else
                          {
                              if(process[i]==process[j])
                                {
                                    status=false;
                                    break;
                                }
                                else
                                 {
                                     status=true;
                                     index=i;
                                 }
                            }
                     }
                    if(status)
                    {
                         System.out.println("\nFirst non-repeated character is: "+ process[index]);
                          break;
                    }
              }
     }

    public static void main(String[] ar)
    {
       PrintNonRepeatingFirstChar c=new PrintNonRepeatingFirstChar();     
       c.PNonReFChar("HHellooei");        
    }
} 