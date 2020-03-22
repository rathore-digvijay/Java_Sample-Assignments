class A
{
  A()
  {
  System.out.println("Default constructor is invoked");
  }
  
  A(int x)
  {
  this();
  System.out.println("P constructor of A is invoked");
  }
}
        class B extends A
        {
          B(int x)
          {
            super (5);
		    System.out.println("constructor of B is invoked");
		  }
		}
class constructor_inheritance
{
 public static void main(String s[])
 {
 B b=new B(6);
 B c=new B(5);
 }
} 
		