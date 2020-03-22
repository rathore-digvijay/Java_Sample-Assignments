
class Mergesort
{
  static int z[];

  static void mergesort(int a[],int b[])
  {
    z=new int[a.length+b.length];
  
//copy Arrays into one Array
    for(int i=0;i<a.length;i++)
    {
      z[i]=a[i];
    }
    for(int i=a.length,j=0;i<z.length && j<b.length;i++,j++)
    { 
       z[i]=b[j];
    }

    Sort.sorting(z);//call sort call method
   
    System.out.println("\nSorted Elements in MergeSort:\n");
    for(int i=0;i<z.length;i++)
    {
       System.out.println(z[i]);
    }
  }


  public static void main(String... s)
  {
    mergesort(new int[]{20,10,30,5},new int[]{4,9,0,14,32});
  } 
}