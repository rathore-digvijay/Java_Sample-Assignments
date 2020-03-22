//Find maximum value of Array without sorting

class Maximum
{

   static int max(int a[])
  {
    int x=0;

     for(int i=0;i<a.length;i++)
     {
       if(x<a[i])
       {
         x=a[i];
       }
     }
     return x;
   }  

  public static void main(String... s)
  {
     int y=max(new int[]{2,1,8,7,20,9,15});
     System.out.println("Largest value of Array:"+y);
  }
}