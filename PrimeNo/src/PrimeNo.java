
public class PrimeNo {

	public static void main(String[] args) {
		int count=0;
		System.out.println("the prime no between 1 and 100 are");
		for(int i=1;i<100;i++)
		{
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				count++;
			}
			if(count==2)
			{
				System.out.println(i);
			}
			count=1;
		}

	}

}
