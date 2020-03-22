class A
{
   int a=67;
   void display(int x)
   {
     a=x;
     System.out.println(x);
     System.out.println(a);
   } 
}     public class this_field
{
     public static void main(String args[])
	 {
     A a1=new A();
	 a1.display(3);
	 
	 System.out.println(a1.a);
	 }
}
	 
	 //change x to a each place so the globally a will stored as 67