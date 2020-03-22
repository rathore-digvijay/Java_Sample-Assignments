class PrintTriangleWise1
{
    static void trianglewise(int x[])
    {
       for(int i=0;i<x.length;i++)
        {
          for(int j=0;j<=i;j++) 
            {
               System.out.print(x[i]+" ");    
            }
            System.out.println();    
        }    
    }
   
    public static void main(String... s)
    { 
       trianglewise(new int []{1,2,3,4,5,6});     
    }
}