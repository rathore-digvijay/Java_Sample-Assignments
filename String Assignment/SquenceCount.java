//take 'n' and other letter and check continuous occurence of this letter

import java.util.*;

class SquenceCount
{
      
     static void squencecount(String str) 
     {
         char c1;
         int count=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character to find squence");
      //  c1=sc.next().charAt(0);              
        c1=sc.nextLine().charAt(0);    
         
         for(int i=0; i<str.length(); i++)
         {
           char c=str.charAt(i);
              if(c==c1)
               {
                   count++;
                   i++;
                   c=str.charAt(i);
                    if(c==c1)
                     {
                        count++;       
                     } 
                     else if(count>=2)
                     {
                       count=count;   
                     }    
                     else if(count<=1)     
                     {
                        count=0;
                     }
                  }    
              }
        
            if(count==0)
             {
               System.out.println(c1+" has not occured more than one time.");  
             }
            else
             {
                System.out.println(c1+" has occured more than one time.");  
             }
             System.out.println("Squence Count: "+count);
        }
        
        public static void main(String... s) 
        {
              squencecount("HHelloooo India nooow");           
        }    
}