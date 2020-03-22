import java.util.Arrays;

class Mode
{
   static float findmode(int a[])
   {    
        int i;
        int freq[]={0};
         float modevalue;
        
        Arrays.sort(a);    
        for(int k:a){
        System.out.print(k+" ");}
          System.out.println(" "); 

        for(i=0;i<a.length;i++)
         freq[a[i]]++;
       
        for(i=0;i<a.length;i++)
         System.out.printf("freq[%d]=%2d\n",i,freq[i]);

       return 0.0f;    
      }

      public static void main(String... s)
      {
         float modevalue=findmode(new int[]{4,4,2,6,2,2}); 
         System.out.println("Mode value of Array elements: "+modevalue);
      }
}