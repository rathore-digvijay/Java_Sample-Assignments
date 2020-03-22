class Median
{
   static float findmedian(int a[])
   {
        float m=0;
        int n=0,p=0;
      
        if(a.length%2==0)
        {
           m=a.length/2;
           n=(int)(m-1);
           p=(int)m;     
           m=(float)(a[n]+a[p])/2;  //in array index starts from zero
 
           return m;  
        }
        else
        {
           m=(float)(a.length)/2; //in array index starts from zero 
           n=(int)m;
           m=a[n];
     
           return m;
        }
     }

    public static void main(String... s) 
    {
       float m=findmedian(new int[]{1,4,13,7});
       System.out.println("Median of Array elements: "+m);
    }
}

