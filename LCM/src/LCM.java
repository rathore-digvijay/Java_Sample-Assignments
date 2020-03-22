import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		int a,b;
		int smaller, bigger;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b)
		{
			bigger = a;
			smaller = b;
		}
		else
		{
			bigger = b;
			smaller = a;
		}
		for(int i=1;i<=bigger;i++)
		{
			if(((bigger*i)%smaller)==0)
			{
				int lcm = bigger*i;
				System.out.println("The LCM is "+lcm);
				break;
			}
		}
		
	}

}
