class MatrixTrans
{
   static void transpose(int a[][])
  {
   int col=0;
   
   System.out.println("\nBefore Transpose Matrix\n");
    for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a[i].length;j++)
       {
          col=a[i].length;
          System.out.print(a[i][j]+"\t");
       }
       System.out.println();
     }

    int trans[][]=new int[col][a.length];
    System.out.println("\n\nAfter Transpose Matrix\n");
    for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a[i].length;j++)
       {
          trans[j][i]=a[i][j];
       }
     }
   
     for(int i=0;i<col;i++)
     {
       for(int j=0;j<a.length;j++)
       {
          System.out.print(trans[i][j]+"\t");
       }
       System.out.println();
     }
   }   

   public static void main(String... s)
   {
     transpose(new int[][]{{1,2,7},{4,5,1}});     
   }
}