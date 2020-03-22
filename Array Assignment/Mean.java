class Mean
{
   static float findmean(int a[])
   {
      float m=0;

      for(int i=0;i<a.length;i++)
      {
         m=m+a[i];
      }
      m=m/a.length;
      return m;      
   }
  
   public static void main(String[] ar)
   {
      float m1=findmean(new int[]{1,5,3,6,6});
  
      System.out.println("Mean of Array elements: "+m1);
   }
}