//constructor overloading

class A
{
   int x;
   A(int a)
   {
      x=a;
      System.out.println("Hello");
   }
      A()
      {
         System.out.println("Hi");
      }
}

class Dimo
{
   public static void main(String args[])
   {
   A a1=new A(5);
   A a2=new A(3);
   A a3=new A(6);
     A a4=new A();
   }
   
 }  

