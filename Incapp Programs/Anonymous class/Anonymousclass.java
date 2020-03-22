class A
{
 public void show()
 {
   System.out.println("Hello Incapp !");
   }
 }
class  Anonymousclass
{
  public static void main(String s[])
  {
   A a=new A(){
   public void show()
   {
   System.out.println("hie Incapp !");
   }
};
a.show();
}
}
   