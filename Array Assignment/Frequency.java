
public class Frequency
{
    static void freqCount(int arr[])
    {
        int j,count,i;
        int c,ch;

       System.out.println("\n   Letter"+"          Frequency\n");       

       for(i=0;i<10;i++)
       {
            count=0;
            for(j=0; j<arr.length; j++)
            {
                if(i==arr[j])
                {
                   count++;
                }
             }
             if(count>0)
             {
               System.out.println("     "+i+"                "+count);              
             }
        }
     }

    public static void main(String[] ar)
    {
       freqCount(new int[]{2,3,1,2,3,4,4});        
    }
} 