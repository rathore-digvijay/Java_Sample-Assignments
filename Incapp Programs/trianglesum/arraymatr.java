class arraymatr
{
   public static void main(String args[])
   {
     int a[][]={{7,5,1},{34,56,48},{48,9,96}};
	 trianglesum a1=new trianglesum();
      int r1=a1.lowersum(a);
	  System.out.println("sum of lowertriangle is:"+r1);
	 trianglesum a2=new trianglesum();
	    int r2=a2.uppersum(a);
			  System.out.println("sum of uppertriangle is:"+r2);
trianglesum a3=new trianglesum();		
		a3.printarray(a);
	  
   }
}

class trianglesum
{
  int lowersum(int a[][])
{
   int s=0;
   for(int i=0;i<a.length;i++)
   {
   for(int j=0;j<=i;j++)
   {
     s+=a[i][j];
	 }
	 }
	 return s;
	 }
	 int uppersum(int a[][])
{
   int s=0,m=0;
   for(int i=0;i<a.length;i++)
   {
   for(int j=2;j>=i;j--)
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