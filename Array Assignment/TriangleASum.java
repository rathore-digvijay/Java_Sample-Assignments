class TriangleASum
{
   static void triangleA(int a[][])
  {
   int firstrowsum=0;
   
   System.out.println("\n Matrix\n");
    for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a[i].length;j++)
       {
          System.out.print(a[i][j]+"\t");
       }
       System.out.println();
     }

  //Logic for sumTriangleA
    //Logic for firstrow sum
    for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a[i].length;j++)
       {
          firstrowsum+=a[i][j];
       }
       break;
     }
     
   //Logic for First Diagonal
    int z=0;
     for(int i=0;i<a.length;i++)
     {
       z=z+a[i][i];
     }

   //Logic for Last Column
    int colSum=0;
    int colLast=a[0].length-1;
    for(int i=0;i<a.length;i++)
     {
          colSum+=a[i][colLast];
     }    
    
     int A=a.length-1;

     int sumtriangleA=firstrowsum+z+colSum-a[0][0]-a[0][colLast]-a[A][colLast];  
     System.out.println("\n\nSum of TriangleA: "+sumtriangleA);
  }

   public static void main(String... s)
   {
     triangleA(new int[][]{{1,2,7,6},{4,5,1,7},{1,1,1,9},{1,0,1,9}});     
   }
}