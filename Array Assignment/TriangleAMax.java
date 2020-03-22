class TriangleAMax
{
    static int m1,m2,m3,m4,max;
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
           //Logic for maxTriangleA
           //Logic for firstrow max

           for(int i=0; i<a.length; i++)
           {
              for(int j=0; j<a[i].length; j++)
              {
                   if(m1<a[i][j]) 
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

          //Logic for find max value from third column

           for(int i=0; i<a.length; i++)
           {
              int j=a.length-1;
                   if(m3<a[i][j])
                   {
                      m3=a[i][j];  
                   }                          
           }
   
            //logic for max value of remaining values  
            if(m1>m2)
            { m4=m1; }
           else{ m4=m2; }
 
            if(m4>m3)
            { max=m4; }
            else{ max=m3; }
 
           System.out.println("\n\nMaximum Value of TriangleA: "+max);
         }
        else
        {
          System.out.println("\n\nPlz use 3x3 or 4x4 like this matrix order.....");
         }
     }//end of method
 
   public static void main(String... s)
   {
     triangleMax(new int[][]{{10,210,6,},{4,1,6},{7,8,100}});     
   }
}