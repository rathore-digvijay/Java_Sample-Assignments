//By QuickSort

class Sort1
{
  static void sorting(int a[][])
  {   
    System.out.println("Array before Sorting:");
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        System.out.print("\t"+a[i][j]);
      }
      System.out.print("\n");
    }

 //Logic to sort 2D Array

    for(int i=0;i<a.length;i++)
    {
      for(int j=0; j<a[i].length; j++)
      {
        for(int k=0;k<a.length;k++)
        {
          for(int l=0;l<a[i].length;l++)
          {
       
           if(a[k][l]>a[i][j])
           {
            int y;

            y=a[i][j];
            a[i][j]=a[k][l];
            a[k][l]=y;
           }
          }
         }
       }
     }
    
    System.out.println("Array after Sorting:");
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
       System.out.print("\t"+a[i][j]);
      }
      System.out.println();
    }
  }  

  public static void main(String... s)
  {
    sorting(new int[][]{{20,10,30},{60,25,80},{12,65,42}});
  }
}