class A
{
 private int a=10;
 void show()
 {
   class B 
   {
     void show1()
	 {
	   a=20;
	   System.out.println(a);
	  }
	  }
	   B b=new B();
	   b.show1();
	   System.out.println("hello");
	   }
	   }
	   
	   class localclass
	   {
	     public static void main(String s[])
		 {
		    A a=new A();
			a.show();
		
		 }
		 }
		 
	   
	  