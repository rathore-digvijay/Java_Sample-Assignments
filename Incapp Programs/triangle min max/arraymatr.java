class arraymatr
{
   public static void main(String args[])
   {
     int a[][]={{7,5,1},{34,56,48},{48,9,96}};
	 triangleminmax a1=new triangleminmax();
      int r1=a1.lowermax(a);
	  System.out.println("max of lowertriangle is:"+r1);
	  triangleminmax a2=new triangleminmax();
      int r2=a2.lowermin(a);
	  System.out.println("min of lowertriangle is:"+r2);
	  triangleminmax a3=new triangleminmax();
      int r3=a3.uppermax(a);
	  System.out.println("max of uppertriangle is:"+r3);
	  triangleminmax a4=new triangleminmax();
      int r4=a4.uppermin(a);
	  System.out.println("min of uppertriangle is:"+r4);
	triangleminmax a5=new triangleminmax();
		a5.printarray(a);
	  
   }
}

class triangleminmax
{
  int lowermax(int a[][])
{
    int temp1=a[0][0];
   for(int i=0;i<a.length;i++)
   {
   for(int j=0;j<=i;j++)
   {
     if(temp1<a[i][j])
{
	temp1=a[i][j];
}	
	}
	 }
	 return temp1;
	 }
	 int lowermin(int a[][])
{
    int temp2=a[0][0];
   for(int i=0;i<a.length;i++)
   {
   for(int j=0;j<=i;j++)
   {
     if(temp2>a[i][j])
{
	temp2=a[i][j];
}	
	}
	 }
	 return temp2;
	 }
	 int uppermax(int a[][])
{
   int temp3=a[0][0];
   for(int i=0;i<a.length;i++)
   {
   for(int j=2;j>=i;j--)
   {
     if(temp3<a[i][j])
{
	temp3=a[i][j];
}	
	}
	 }
	 return temp3;
	 }
	  int uppermin(int a[][])
{
   int temp4=a[0][0];
   for(int i=0;i<a.length;i++)
   {
   for(int j=2;j>=i;j--)
   {
     if(temp4>a[i][j])
{
	temp4=a[i][j];
}	
	}
	 }
	 return temp4;
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