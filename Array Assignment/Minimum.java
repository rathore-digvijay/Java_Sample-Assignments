//Find minimum value of Array without sorting

class Minimum
{
  static int min(int a[])
  {
    int x=Integer.MAX_VALUE;
 
    for(int i=0;i<a.length;i++)
    {
      if(x>a[i])
      {
        x=a[i];
      }
    }
    return x;
  }  

  public static void main(String... s)
  {
    int x=min(new int[]{2,1,8,7,10,9,15}); 
    System.out.println("Minimum value of Array:"+x);
  }
}