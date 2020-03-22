
//Intersection of two Array

class Intersection
{
  static int flag=0,k=0;

  static int []y=new int[5];
 
  static void intersection(int a[],int b[])
  { 
    System.out.println("First Array:");
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]+"\t");

    System.out.println("\n\nSecond Array:");
    for(int i=0;i<b.length;i++)
    System.out.print(b[i]+"\t");
    
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<b.length;j++)
      {
        if(a[i]==b[j])
        {
          flag=1;
          break;
        }
       else //if we are not using else here. so,program will give error
        {
          flag=0;
        } 
      }
      if(flag==1)
      {
        y[k]=a[i];
        k++;
      }
    }  
    
    System.out.println("\n\n\nIntersection of Two Arrays:");
    if(k>1) //if intersection set is not available. so, program will give error
    {
      for(int i=0;i<k-1;i++)
      {
        System.out.print(y[i]+",");
      }       
      System.out.print(y[k-1]);
    }
    else
    {
      System.out.println("Intersection set is not available");
    }
  }
    

  public static void main(String... s)
  {
    intersection(new int[]{1,2,5,8,7},new int[]{5,8,8,2,9,15});
  }
}