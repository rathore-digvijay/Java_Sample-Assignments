class arraymatr
{
   public static void main(String args[])
   {
     int a[][]={{7,5,1},{34,56,48},{48,9,96}};
	 int b[][]={{4,5,8},{47,85,78},{78,7,56}};
	 int c[][]=new int[a.length][a[0].length];
	 mulmatrix a1=new mulmatrix();
      a1.mul(a,b,c);
	  System.out.println("multiple of matrices is:");
	   mulmatrix a2=new mulmatrix();
	  a2.printarray(a,b,c);
	  
   }
}

class mulmatrix
{
  void mul(int a[][],int b[][],int c[][])
{
   for(int i=0;i<a.length;i++)
   {
   for(int j=0;j<b[i].length;j++)
   {
     for(int k=i;k<a[i].length;k++)
	 {
	      c[i][j]+=a[i][k]*b[k][j];
	 }
	 }
	 }
}
      void printarray(int a[][],int b[][],int c[][])
	 {
	    for(int i=0;i<a.length;i++)
		{
		   for(int j=0;j<a[i].length;j++)
		   {
		   System.out.print("\t"+a[i][j]);
		   }
		    System.out.println();
		   }
		   System.out.println();

      for(int i=0;i<b.length;i++)
		{
		   for(int j=0;j<b[i].length;j++)
		   {
		   System.out.print("\t"+b[i][j]);
		   }
		    System.out.println();

		  }
		  System.out.println();

            for(int i=0;i<c.length;i++)
		{
		   for(int j=0;j<c[i].length;j++)
		   {
		   System.out.print("\t"+c[i][j]);
		   }
		   System.out.println();
	 }
	 }
}
	 
	 