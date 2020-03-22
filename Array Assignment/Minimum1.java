//Find minimum value of Array without sorting

class Minimum1
{
  static int min(int a[][])
  {
    int x=Integer.MAX_VALUE;

    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        if(x>a[i][j])
        {
         x=a[i][j];
        }
      }
    }
    return x;
  }  

  public static void main(String... s)
  {
    int x=min(new int[][]{{20,10,30},{60,25,80},{12,65,42}});
    System.out.println("Minimum value of Array:"+x);
  }
}