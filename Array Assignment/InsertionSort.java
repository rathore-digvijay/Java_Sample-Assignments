//By InsertionSort

class InsertionSort
{
  static void sorting(int a[])
  {
    System.out.println("\nArray before Sorting:\n");
    for(int i=0;i<a.length;i++)
    {
     System.out.print(a[i]+"\t");
    }

    for(int i=0;i<a.length;i++)
    {
      for(int j=i;j<a.length-1;j++)
      {
        if(a[i]>a[j+1])
         {
          int y;

          y=a[i];
          a[i]=a[j+1];
          a[j+1]=y;
         }
       }
     }

 
    System.out.println("\n\nArray After Sorting:\n"); 
    for(int i=0;i<a.length;i++)
    {
     System.out.print(a[i]+"\t");
    }
  }  

  public static void main(String... s)
  {
    sorting(new int[]{2,8,6,5,15,0});
  }
}