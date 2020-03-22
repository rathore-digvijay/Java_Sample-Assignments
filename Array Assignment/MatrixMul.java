class MatrixMul
{
   static int columnfirst,columnsecond;
   static void addMatrix(int a[][],int b[][])
   {
     System.out.println("\nFirst Matrix\n");
     for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a[i].length;j++)
       {
          columnfirst=a[i].length;
          System.out.print(a[i][j]+"\t");
       }
       System.out.println();
     }   

     System.out.println("\nSecond Matrix\n");
     for(int i=0;i<b.length;i++)
     {
       for(int j=0;j<b[i].length;j++)
       {
          columnsecond=b[i].length;
          System.out.print(b[i][j]+"\t");
       }
       System.out.println();
     }

    //Logic of Multiplication of two matrix
   
    if(columnfirst==b.length)
    {
      int c[][]=new int[a.length][columnsecond];
      System.out.println("\n\nMultiplication Of Two Matrix\n");
      for(int i=0;i<a.length;i++)
      {
        for(int j=0;j<columnsecond;j++)
        {
          for(int k=0;k<a[i].length;k++)
          {
             c[i][j]+=a[i][k]*b[k][j];
           }
          System.out.print(c[i][j]+"\t");
         }
         System.out.println();
       }
      }//end if
      else
      {
        System.out.println("\n\nPlz enter proper order matrices to do maultiplication");  
      }
  }
  
   public static void main(String s[])
   {
      addMatrix(new int[][]{{2,1},{5,1},{2,1}},new int[][]{{0,4,1,4},{8,8,1,6}});
   }
}
