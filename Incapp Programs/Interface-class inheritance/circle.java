class circle extends A implements shape
{
	private double ar;                  // if u wish to make private
	public void findArea()
	{
	 double r=2.4;
	ar=3.14*r*r;
	}
	public void printArea()
	{
		System.out.println("circle's Area="+ar);
		show();
	}
	
	}