class Emp
{
	static
	{
		System.out.println("This is static block");
	}
	private String name;
	private int salary;
	static private String cname;
          
		  void input(String n,int s)
		  {
			  name=n;
			  salary=s;
		  }
           void show()
		{
		System.out.println(name+"\t"+salary+"\t"+cname);
		}
		static void cinput(String c)
		{
			cname=c;
		}
}

class deemo
{
	static int x=10;
	static public void main(String s[])
	{
		System.out.println(x);
		Emp.cinput("TCS");
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp e3;
		e3=new Emp();
		Emp e4=new Emp();
		//e3.input("ffffffffffff");
		e1.input("Ram",12500);
		e2.input("lalu",21);
		e3.input("rajnikant",1000000);
		
		e1.show();
		e2.show();
		e3.show();
		e4.show();
		
	}
}