import java.util.Scanner;

public class PrintDiagonalWise {
	
	int row=5;
	int col=4;
	
	int min(int a, int b)
	{ return(a<b)?a:b; }
	
	int min(int a, int b, int c)
	{ return min(min(a,b),c); }
	
	int max(int a, int b)
	{ return(a>b)?a:b; }
	
	void diagonalOrder(int a[][])
	{
      for(int line=0; line<=row+col-1; line++)
      {
    	  int start_col=max(0,line-row);
    	  
    	  int count=min(line,(col-start_col),row);
    	  
    	  for(int j=0; j<count; j++)
    		  System.out.print(a[min(row,line)-j-1][start_col+j]+"\t");
    	  
    	  System.out.println();
    	  
      }
	}
	
	void printMatrix(int m[][])
	{
		for(int i=0; i<m.length; i++)
		{
			for(int j=0; j<m[i].length; j++)
				System.out.print(m[i][j]+"\t");
			
			System.out.println();
		}
	}
	
	     public static void main(String[] ar)
	     {
	    	 PrintDiagonalWise p=new PrintDiagonalWise();
	    	 Scanner sc=new Scanner(System.in);
	    	 
	    	 System.out.println("Enter the size of Matrix");
	    	 int a=sc.nextInt();
	    	 int b=sc.nextInt();
	    	 
	    	 int x[][]=new int[a][b];
	    	 
	    	 System.out.println("Enter the elements of Matrix");
	    	 for(int i=0; i<x.length; i++)
	    	 {
	    	    for(int j=0; j<x[i].length; j++)
	    	    {
	    	    	x[i][j]=sc.nextInt();
	    	    }
	    	 }
	    	 
	    	 System.out.println("Given matrix is \n");
	    	 p.printMatrix(x);
	    	 	    	 
	    	 System.out.println("Diagonal printitng of matrix is \n");
	    	 p.diagonalOrder(x);
	     }	
}
