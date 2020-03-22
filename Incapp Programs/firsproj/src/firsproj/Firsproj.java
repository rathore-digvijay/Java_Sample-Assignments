
package firsproj;

public class Firsproj {

    public static void main(String[] args) {
        System.out.println("Hello Incapp");
        int a=10,b=3,c;
        
        c=a+b;
        System.out.println("sum = "+c);
        A a1=new A();
        a1.showA();
        System.out.println(a1.x);
        B b1=new B();
        b1.showB();
        System.out.println(b1.y);
        C c1=new C();
        c1.show();
        System.out.println(c1.z);
        }
   }
class A
{
    int x=45;
    void showA()
    {
        System.out.println("Hello A");
    }
}
