class D implements C
{
public int add(int x,int y)
{
 return(x+y);
 }
 public int sub(int x,int y)
 {
  return(x-y);
  }
  public int mul(int x,int y)
  {
  return(x*y);
  }
  }
     class Demo
	 {
	 public static void main(String args[])
	 {
	 A a=new D();
	 System.out.println(a.add(4,8));
	 //System.out.println(a.sub(4,2));
	 //System.out.println(a.mul(4,2));
	
	 B b=new D();
	 //System.out.println(b.add(4,8));
	 System.out.println(b.sub(4,2));
	 //System.out.println(b.mul(4,2));
	 
	 C c=new D();
	 System.out.println(c.add(4,8));
	 System.out.println(c.sub(4,2));
	 System.out.println(c.mul(4,2));
	 
	 
	D d=new D();
	System.out.println(d.add(4,8));
	System.out.println(d.sub(4,2));
	System.out.println(d.mul(4,2));
	}
	}