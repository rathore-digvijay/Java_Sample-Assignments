class arraymatr
{
   public static void main(String args[])
   {
     int a[][]={{7,5,1},{34,56,48},{48,9,96}};
	 int b[][]={{4,5,8},{47,85,78},{78,7,56}};
	 int c[][]=new int[a.length][a[0].length];
	 addmatrix a1=new addmatrix();
      a1.add(a,b,c);
	  System.out.println("addition of matrices is:");
	   addmatrix a2=new addmatrix();
	  a2.printarray(a,b,c);
	  
   }
}

class addmatrix
{
  void add(int a[][],int b[][],int c[][])
{
   for(int i=0;i<a.length;i++)
   {
   for(int j=0;j<a[i].length;j++)
   {
	   
     c[i][j]=a[i][j]+b[i][j];
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
	 
	 