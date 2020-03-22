// HCF of Array

class HCF
{
    static int gethcf(int... x)
    {
       int smallest=getSmallest(x);
  
       for(int i=smallest; i>=1; i--)
       {
          int j;
          for(j=0; j<x.length; j++)       
          {
             if(x[j]%i!=0)
               break;
          }  

          if(j==x.length)
           return i;
       }
       return 1;     
    }

    static int getSmallest(int x[])
    {
       int smallest=x[0];
       for(int i=0; i<x.length; i++)
       {
           if(x[i]<smallest) 
             smallest=x[i]; 
       }
       return smallest;
    }

   public static void main(String... s)
   {
      System.out.println("HCF:"+gethcf(5,20,30));
   }
}