class TriangleBSum
{
   static void triangleB(int a[][])
  {
   int thirdrowsum=0;
   
   System.out.println("\n Matrix\n");
    for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a[i].length;j++)
       {
          System.out.print(a[i][j]+"\t");
       }
       System.out.println();
     }

  //Logic for sumTriangleB
    //Logic for thirdrow sum
    int row=a.length-1;
    for(int j=0;j<a[0].length;j++)
    {
          thirdrowsum+=a[row][j];
    }
     System.out.println("Row:: "+thirdrowsum);
     
   //Logic for First Diagonal
    int z=0;
     for(int i=0;i<a.length;i++)
     {
       z=z+a[i][i];
     }
     System.out.println("Diagonal: "+z);

   //Logic for First Column
     int col=0;
     int colSum=0;
     for(int i=0;i<a.length;i++)
     {
         colSum+=a[i][col];
     }
     System.out.println("Col: "+colSum);
    
     int A=a.length-1;
     int B=a[0].length-1;
     int sumtriangleB=thirdrowsum+z+colSum-a[0][0]-a[A][0]-a[A][B];  
     System.out.println("\n\nSum of TriangleB: "+sumtriangleB);
  }

   public static void main(String... s)
   {
     triangleB(new int[][]{{1,2,7,2},{4,5,1,3},{1,1,1,4},{1,7,1,4}});     
   }
}