class TriangleBMax
{
        static int m1,m2,m3,m4, max;
    static void triangleMax(int a[][])
    {
       int n=0;
       System.out.println("\n Matrix\n");
       for(int i=0;i<a.length;i++)
       {
          for(int j=0;j<a[i].length;j++)
          {
             n=a[i].length;
            System.out.print(a[i][j]+"\t");
           }
           System.out.println();
        }
 
        if(a.length==n)
       {
           //Logic for maxTriangleB
           //Logic for thirdrow max
          
            for(int i=2; i<a.length; i++)
           {
              for(int j=0; j<a[i].length; j++)
              {
                   if(m1<a[i][j]) //here value of j1 is not changing when j1+1=1 but j1=0 not 1 for next use 
                   {
                      m1=a[i][j];  
                   }         
             }
              break;                    
          }
       
       
          //Logic for First Diagonal max

           for(int i=0; i<a.length; i++)
           {
                   if(m2<a[i][i])
                   {
                      m2=a[i][i];  
                   }                          
           }

        //Logic for find max value from first column

           for(int i=0; i<a.length; i++)
           {
              int j=0;
                   if(m3<a[i][j])
                   {
                      m3=a[i][j];  
                   }                          
           }
           System.out.println("column:"+m3);
   
           //logic for max value of remaining values  
           if(m1>m2)
            { m4=m1; }
           else{ m4=m2; }
 
            if(m4>m3)
            { max=m4; }
            else{ max=m3; }
 
           System.out.println("\n\nMaximum Value of TriangleB: "+max);
         }
        else
        {
          System.out.println("\n\nPlz use 3x3 or 4x4 like this matrix order.....");
         }
     }//end of method
 
     public static void main(String... s)
     {
       triangleMax(new int[][]{{1,20,3},{400,50,6},{70,8,9}});     
     }
}