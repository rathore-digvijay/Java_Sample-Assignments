class arraymatr
{
   public static void main(String args[])
   {
     int a[][]={{7,5,1},{34,56,48},{48,9,96}};
	 matrixsum a1=new matrixsum();
      int r=a1.sum(a);
	  System.out.println("sum of matrix is:"+r);
	  a1.printarray(a);
	  
   }
}

class matrixsum
{
  int sum(int a[][])
{
   int s=0;
   for(int i=0;i<a.length;i++)
   {
   for(int j=0;j<a[i].length;j++)
   {
     s+=a[i][j];
	 }
	 }
	 return s;
	 }
	 void printarray(int a[][])
	 {
	    for(int i=0;i<a.length;i++)
		{
		   for(int j=0;j<a[i].length;j++)
		   {
		   System.out.print("\t"+a[i][j]);
		   }
		   System.out.println();
}

	 }
	 }