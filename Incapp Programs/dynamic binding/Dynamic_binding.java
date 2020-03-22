class A
{
 int x=10;
 void show()
 {
   System.out.println("Hello A");
 }
 void print()
 {
  System.out.println("Hi A");
 }
}
     class B extends A 
      {
	    int y=20;
		void show()
		{
		  System.out.println("Hello B");
		}
        void display()
        {
		  System.out.println("Incapp B");
		}
      }

class C extends A
{
  int z=30;
  void show()
  {
   System.out.println("Hello C");
  }
}
     class Dynamic_binding
	 // runtime polymorphism
	 {
	  public static void main(String ss[])
	  {
	    A a=new A();
		a.show();
		a.print();
		a=new B();
		a.print();
		a.show();
		a=new C();
		a.show();
		a.print();
		}
		}