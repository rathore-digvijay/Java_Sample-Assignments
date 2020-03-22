class A
{
   int a=10;
   void show()
   {
     System.out.println(a);
	 }
	 static class C
	 {
	   int a=10;
	   void show1()
	   {
	     a=20;
		 System.out.println(a);
	   }
	  }
}

class NestedClassExample
{
  public static void main(String args[])
  {
    A a=new A();
	A.C c=new A.C();
	a.show();
	c.show1();
	}
	}
	