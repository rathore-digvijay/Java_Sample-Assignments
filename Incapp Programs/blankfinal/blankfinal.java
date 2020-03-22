class A
{
final int x;
A(int a)
{
x=a;
}
void show()
{
}
}
class Demo
{
   public static void main(String args[])
   {
   A a1=new A(5);
   A a2=new A(9);
   A a3=new A(6);
   //a1.x=48;  error
   System.out.println(a1.x);
   }}
   
   
   // for using final variable for different object creation by passing and storing different values otherwise it is error as a1.x=6161;