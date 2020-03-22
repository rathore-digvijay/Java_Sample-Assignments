//LCM of Array
import java.util.Arrays;

class LCM
{
   private static double LCM=1;
    static int returnMinValue(int array[])
    {
       int min=Integer.MAX_VALUE;
       for(int i=0;i<array.length;++i)
       {
         if(array[i]!=1&&array[i]<min)
         {
            min=array[i];
         }  
       }
        return min;
    }

     static int returnFirstDivisor(int val)
     {
        if(val==Integer.MAX_VALUE)
        {
           return -1; //Return -1 to signal end
        }
       else
        {
           for(int i=2;i<=val;++i)
           {
              if(val%i==0)
              {
                 LCM*=i;
                 System.out.print(i+" ");
                 return i;
              }
           }  
         }
         System.err.println("Unnecesary return!");
        return -10;
     }
   
   public static void main(String... s)
   {
     int array[]={9,2,20};

     while(true)
     {
        int minDivisor=returnFirstDivisor(returnMinValue(array));
        if(minDivisor==-1)break;

        for(int i=0; i<array.length; ++i)
        {
          if(array[i]%minDivisor==0){
           array[i]/=minDivisor;}
        }
         System.out.println(Arrays.toString(array)+"\n");
      }
     System.out.println("LCM:"+LCM);
   }
}