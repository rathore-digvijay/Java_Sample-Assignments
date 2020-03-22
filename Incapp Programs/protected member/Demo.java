import lalu.pagal.D;
import lalu.B;
class Demo
{
   public static void main(String args[])
   {
      System.out.println("Hi");
      A a1=new A();
      a1.show();
      System.out.println(a1.x);
      D d1=new D();
      d1.showD();
      System.out.println(d1.m);
   }
}
     class A extends B
    //class A
    {
        int x=25;
        void show()
        {
           System.out.println("Hello A");
		   //B b1=new B();
          // b1.print();
          // System.out.println(b1.y);
		        System.out.println(y);
		  
        }
    }
	 