public class ExceptionHandling_Ex1
{
  public static void main(String args[])
  {
    System.out.println("Hello");
	int n=20,a=0,r=0,x[]={7,1,5,4,0,98,8};
	try
	{
	  r=n/a;
	  System.out.println("Division="+r);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Baawali poonch.");
    }
	try
	{
	  System.out.println(x[40]);
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("Baawali poonch. 2");
    }
	System.out.println("Hi");
	r=n+a;
	System.out.println("sum="+r);
	System.out.println("thank you");
	System.out.println("Bye");
   }
}