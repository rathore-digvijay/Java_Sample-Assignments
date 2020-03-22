class arraymatr
{
   public static void main(String args[])
   {
     int a[][]={{7,5,1},{34,56,48},{48,9,96}};
	 maxmin a1=new maxmin();
      int r1=a1.maxmatrix(a);
	  System.out.println("max of the matrix is:"+r1);
	  maxmin a2=new maxmin();
	   int r2=a2.minmatrix(a);
	  System.out.println("min of the matrix is:"+r2);
	  maxmin a3=new maxmin();
	  a3.printarray(a);
	  
   }
}

class maxmin
{
  int maxmatrix(int a[][])
{
	
   int temp1=a[0][0];
   for(int i=0;i<a.length;i++)
   {
   for(int j=0;j<a[i].length;j++)
   {
if(temp1<a[i][j])
{
	temp1=a[i][j];
}	
	}
	 }
	 return temp1;
	 }
	 int minmatrix(int b[][])
{
	
   int temp2=b[0][0];
   for(int k=0;k<b.length;k++)
   {
   for(int l=0;l<b[k].length;l++)
   {
if(temp2>b[k][l])
{
	temp2=b[k][l];
	}	
	}
	 }
	 return temp2;
	 }
	 
	 void printarray(int c[][])
	 {
	    for(int q=0;q<c.length;q++)
		{
		   for(int w=0;w<c[q].length;w++)
		   {
		   System.out.print("\t"+c[q][w]);
		   }
		   System.out.println();
}
 }
	 }