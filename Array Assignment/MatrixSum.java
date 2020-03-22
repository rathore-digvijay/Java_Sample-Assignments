class MatrixSum
{
   static void sum(int a[][])
  {
   //int col=0;
   
   System.out.println("\n Matrix\n");
    for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a[i].length;j++)
       {
          //col=a[i].length;
          System.out.print(a[i][j]+"\t");
       }
       System.out.println();
     }

    System.out.println("\n\nAddition of Matrix Rows\n");
    for(int i=0;i<a.length;i++)
     {
       int x=0;
       for(int j=0;j<a[i].length;j++)
       {
          x+=a[i][j];
       } 
       System.out.println(x+"\t");
     }

     System.out.println("\n\nAddition of Matrix Columns\n");
     for(int i=0;i<a.length;i++)
     {
       int y=0;
       for(int j=0;j<a[i].length;j++)
       {
          y+=a[j][i];
       } 
       System.out.print(y+"\t");
     }
    
   //Logic for First Diagonal
    int z=0;
    System.out.println("\n\nAddition of Matrix Diagonal\n");
     for(int i=0;i<a.length;i++)
     {
       z=z+a[i][i];
     }
      
    //Logic for Second Diagonal
      int k=a.length-1; int z1=0;
     
      for(int i=0;i<a.length;i++)
     {
        if(k>=0)
        {
            z1=z1+a[i][k];
            k--;
        }
     }
     System.out.println("Sum of First Diagonal Elements:\t"+z);
     System.out.println("Sum of Second Diagonal Elements:"+z1);
  }

   public static void main(String... s)
   {
     sum(new int[][]{{1,2,7},{4,5,1},{1,1,1}});     
   }
}