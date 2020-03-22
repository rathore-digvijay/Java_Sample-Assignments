//Find maximum value of Array without sorting

class Maximum1
{
  static int max(int a[][])
  {
    int x=0;

    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        if(x<a[i][j])
        {
         x=a[i][j];
        }
      }
    }
    return x;
  }  

  public static void main(String... s)
  {
    int x=max(new int[][]{{20,10,30},{60,25,80},{12,65,42}});
    System.out.println("Largest value of Array:"+x);
  }
}