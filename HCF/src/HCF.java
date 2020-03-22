import java.util.Scanner;

public class HCF {
	static int i;
	static int hcf(int x,int y)
	{
		for(i=x; i>=1; i--)
		{
			if(x%i == 0 && y%i == 0)
			{
				break;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int x;
		int y = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nos. to find HCF and Press 0 to exit");
		
		while(true)
		{
			x = sc.nextInt();
			if(x<1)
				break;
			else if (y == -1)
				y = x;
			else if (x<y)
				y = hcf(x, y);
			else
				y = hcf(y, x);
		}
		System.out.println("HCF = "+y);
	}
}
