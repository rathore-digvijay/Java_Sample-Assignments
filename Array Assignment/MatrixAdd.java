class MatrixAdd
{
  static void addMatrix(int a[][],int b[][])
  {
    int c[][]=new int[2][3];
    System.out.println("\nMatrix must be same in order to add them\n");
    System.out.println("\nFirst Matrix\n");
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
         System.out.print(a[i][j]+"\t");
      }
      System.out.println();
    }   

    System.out.println("\nSecond Matrix\n");
    for(int i=0;i<b.length;i++)
    {
      for(int j=0;j<b[i].length;j++)
      {
         System.out.print(b[i][j]+"\t");
      }
      System.out.println();
    }

   System.out.println("\nAddition of Two Matrix\n");
    for(int i=0,k=0;i<a.length&&k<b.length;i++,k++)
    {
      for(int j=0,l=0;j<a[i].length&&l<b[k].length;j++,l++)
      {
         if(i==k&&j==l)
         {
           c[i][j]=a[i][j]+b[k][l];
           System.out.print(c[i][j]+"\t"); 
         }
      }
      System.out.println();
    }
  }
  
   public static void main(String s[])
   {
      addMatrix(new int[][]{{2,1,7},{5,1,2}},new int[][]{{0,4,9},{8,8,7}});
   }
}
