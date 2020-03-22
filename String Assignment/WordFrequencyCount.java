
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCount {
	
	   public static void main(String[] ar)
	   {
	       String s="this is a test this is test lalu";
	 
	       String[] splitted=s.split(" ");

	       Map<String, Integer> hm=new HashMap<String, Integer>();

	       for(int i=0; i<splitted.length; i++)
	       {
	           if(hm.containsKey(splitted[i])) //return true or false if key is present return true otherwise false
	           {
	              int count=hm.get(splitted[i]); //return map(key,value): return value
	              hm.put(splitted[i], count+1);
	           }
	          else
	           {
	               hm.put(splitted[i],1);
	           } 
	       }    
	        System.out.println(hm);      
	   }
}
