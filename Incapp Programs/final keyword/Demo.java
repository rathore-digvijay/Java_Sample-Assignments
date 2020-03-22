class A
{
 final int x=10;
      void show()
	  {
	    System.out.println(x);
		//x=20;   error
		System.out.println(x);
		}
}
class Demo
{
 public static void main(String args[])
 {
   A a=new A();
   a.show();
   System.out.println(a.x);
   //a.x=15;    error
   System.out.println(a.x);
   }
   }
   