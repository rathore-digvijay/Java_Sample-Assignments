class Emp
{
private String name;
private int salary;
private String cname;
		 void input(String n,int s,String c)
			{
				name=n;
				salary=s;
				cname=c;
			}
			void show()
			{
			System.out.println(name+"\t"+salary+"\t"+cname);
			}
		}	
			
			
			class Demo
			{
			 public static void main(String args[])
			 {
			 Emp e1=new Emp();
			 Emp e2=new Emp();
			 Emp e3=new Emp();
			 
			    e1.input("ram",2500,"HCL");
				e2.input("Lalu",21,"Bihar");
				e3.input("rajnikant",2000000,"World");
				
				e1.show();
				e2.show();
				e3.show();
				}
			}
				
			