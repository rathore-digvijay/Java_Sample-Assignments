import java.util.Scanner;

class Ajay1
{ 
    static void secondSmallest(int arr[])
   {
      int first,second;
	  
	  if(arr.length<2)
	   {
	      System.out.println("Plz enter valid array");
		  return;
	   }
	  
	  first=second=Integer.MAX_VALUE;
	  
	  for(int i=0; i<arr.length; i++)
	  {
	      if(arr[i]<first)
		  {
		    second=first;
			first=arr[i];
		  }
		  else if(arr[i]<second && arr[i]!=first)
		  {
		    second=arr[i];
		  }
	   }
	   
	   if(second==Integer.MAX_VALUE)
	   {
	      System.out.println("Second smallest don't  exist");
	   }
	   else
	   {
	     System.out.println("Smallest and Second Smallest "+first+" "+second);
	   }
	      
   }

   public static void main(String... s1)
   {
       int ar[]=new int[10];
       Scanner s=new Scanner(System.in);
		
		for(int i=0;i<ar.length;i++)
		 {
		    ar[i]=s.nextInt();
		 }
   
	    Ajay1.secondSmallest(ar);
   }       

}