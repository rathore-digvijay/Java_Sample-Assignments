//Shift Array elements without Sorting

import java.util.Arrays;

public class MyShift
{
   static void MyShift(int Arr[])
   {
      System.out.println("\nArray Elements Before Sorting:\n");      
      for(int number : Arr){ System.out.print(number+"\t");}
      
      //java's Sorting method
      Arrays.sort(Arr);
   
      System.out.println("\n\nArray Elements After Sorting:\n");
      for(int i=0;i<Arr.length;i++)
      {
        System.out.print(Arr[i]+"\t"); 
      }      
   }
   
   public static void main(String... s)
   {
       MyShift(new int[]{1,2,3,-2,-1,-1,4,3,-4,-5});
   }
}