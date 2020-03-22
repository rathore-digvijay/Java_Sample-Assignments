class arraymatr
{
   public static void main(String args[])
   {
     int a[][]={{7,5,1},{34,56,48},{48,9,96}};
	 diagonalsum a1=new diagonalsum();
      int r=a1.sum1(a);
	  System.out.println("sum of diagonal 1 is:"+r);
diagonalsum a2=new diagonalsum();
      int r1=a2.sum2(a);
	  System.out.println("sum of diagonal 2 is:"+r1);	
	diagonalsum a3=new diagonalsum();
	a3.printarray(a);
	  
   }
}

class diagonalsum
{
  int sum1(int a[][])
{
   int s=0;
   for(int i=0;i<a.length;i++)
   {
     s+=a[i][i];
	 }
	 
	 return s;
}	 
	  int sum2(int a[][])
{
   int s1=0;
   for(int i=0;i<a.length;i++)
   {
   
     s1+=a[i][a.length-(i+1)];
	
   } 
	 return s1;
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