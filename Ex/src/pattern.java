
public class pattern {
	public static void main(String[] args) {
		for(int i=0;i<=3;i++)
		{
			for(int j=3;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--)
			{
				System.out.print(k);
			}
			if(i>0)
			{
				for(int l=1;l<=i;l++)
				{
					System.out.print(l);
				}
			}
			System.out.println();
		}
		
	}
}
