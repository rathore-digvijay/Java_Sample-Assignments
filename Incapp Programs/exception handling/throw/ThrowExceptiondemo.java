class MyException extends Exception
{
  String m;
  MyException(String s)
  {
     m=s;
  }
  public String getmessage()
  {
    return m;
  }
}
class Student
{
  private int age;
  public void setAge(int a) throws MyException
  {
    if(a<=0)
	{
	   throw new MyException("Invalid Age");
	}
	else
	{
	   age=a;
	}
  }
   public int getAge()
   {
    return age;
   }
}
public class ThrowExceptiondemo
{
  public static void main(String args[])  //throws MyException
  {
    Student s=new Student();
	try
	{
	   s.setAge(-12);
	   System.out.println("Your Age is:"+s.getAge());
	}
	catch(MyException me)
	{
	 System.out.println(me.getmessage());
	}
	Student s2=new Student();
	try
	{
	  s2.setAge(5);
	  System.out.println("Your Age is:"+s2.getAge());
	}
	catch(MyException me)
	{
	   System.out.println(me.getmessage());
	}
   }
  }
  