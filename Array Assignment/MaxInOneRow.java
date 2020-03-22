//24. Search that row have maximum one and total no of one in whole matrix

import java.util.Arrays;

class MaxInOneRow
{
   static void maxinonerow(int x[][])
    {
         int a[]=new int[x.length];
         int count=0,k=0,tmp=0,sum=0;

 //print matrix        
         System.out.println("\nMatrix:\n");
         for(int i=0; i<x.length; i++)
          {
              for(int j=0; j<x[i].length; j++)  
                {
                   System.out.print(x[i][j]+"\t");
                }   
               System.out.println(" ");
            } 
 
//count no of 1's in a matrix
             for(int i=0; i<x.length; i++)
            {
                for(int j=0; j<x[i].length; j++)  
                  {
                      if(x[i][j]==1)
                       {
                          count++;
                       }
                  }
                   if(count!=0)
                      { 
                         a[k]=count;
                         k++;              
                      }
                     count=0;
             }

             System.out.println(" \n\n");
       
       //Array sort      
             for(int i=0; i<a.length; i++)
              {
                 for(int j=0 ; j<a.length-1; j++)
                  {
                     if(a[j]<a[j+1])
                     {
                         tmp=a[j];
                         a[j]=a[j+1];
                         a[j+1]=tmp;       
                     }
                  }
             }
    
    
          System.out.println("Maximum 1's in Matrix row: "+a[0]);

           for(int i=0;i<a.length;i++)
            {
              sum+=a[i];
            } 
           System.out.println("Sum of total no of 1's in Matrix: "+sum);                     
   }

    public static void main(String... s)
     {
        maxinonerow(new int[][]{{1,1,1,1,1,0},{0,1,0,1,1,1},{0,0,0,1,1,1},{0,1,0,0,0,1},{0,0,0,0,1,1},{1,1,1,1,1,1}});        
     }
}