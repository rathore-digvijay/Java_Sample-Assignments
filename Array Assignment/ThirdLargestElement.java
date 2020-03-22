public class ThirdLargestElement {
		
	void First3rdLargestValue(int x[])
	{
      int first=Integer.MIN_VALUE;
      int second=Integer.MIN_VALUE;
      int third=Integer.MIN_VALUE;
      
      for(int i=0; i<x.length; i++)
      {
    	  if(first<x[i])
    	  {
    		  second=first;
    		  first=x[i];
    	  }
    	  else if(second<x[i] && first!=x[i])
    	  {
    		 third=second;
    	     second=x[i];
    	  }
    	  else if(third<x[i] && second!=x[i])
    	  {
    		  third=x[i];
    	  }
      }
      System.out.println("First Largest: "+first);
      System.out.println("Second Largest: "+second);
      System.out.println("Third Largest: "+third);
      
     return ;
	}
	     public static void main(String[] ar)
	     {
	    	ThirdLargestElement tle=new ThirdLargestElement();
	    	 tle.First3rdLargestValue(new int[]{17,6,4,3,1,9,5,8});   	 
	
	     }	
}
