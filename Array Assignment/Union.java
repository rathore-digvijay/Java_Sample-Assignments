//Union of two Array

class Union
{
  static int flag=0,k;
 
  static void union(int a[],int b[])
  {
    int []y=new int[a.length+b.length];   

    System.out.println("First Array:");
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]+"\t");

    System.out.println("\n\nSecond Array:");
    for(int i=0;i<b.length;i++)
    System.out.print(b[i]+"\t");
   
    k=b.length;   
    for(int i=0;i<b.length;i++)
    {
      y[i]=b[i];
    }  
 
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<b.length;j++)
      {
        if(a[i]!=b[j])
        {
          flag=1;
        }
        else
        {
          flag=0;
          break;
        }
      }
      if(flag==1)
      {
        y[k]=a[i];
        k++;
      }
    }  
    
    System.out.println("\n\n\nUnion of Two Arrays:\n");
    for(int i=0;i<k-1;i++)
    {
      System.out.print(y[i]+",");
    }       
    System.out.print(y[k-1]);
  }
    

  public static void main(String... s)
  {
    union(new int[]{1,2,5,8,7},new int[]{5,8,8,2,9,15});
  }
}