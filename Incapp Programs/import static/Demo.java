import static my.A.x;
import static my.A.show;  


// import static my.A.*; for importing all the static members of class A of my package
// direct object creation of class A is not allowed as A a=new A(); in main;

class Demo
{
public static void main(String args[])
{
System.out.println("Hi");
show();
System.out.println(x);
}
}