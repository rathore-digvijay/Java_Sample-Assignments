import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		int n, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of random number you want to generate");
		n = sc.nextInt();
		System.out.println("Enter the maximum value of random no.");
		max = sc.nextInt();
		Random t = new Random();
		System.out.println("Random no");
		for(int c=1;c<=n;c++)
		{
			System.out.println(t.nextInt(max));
		}
	}
}
