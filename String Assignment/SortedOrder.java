class SortedOrder
{
    static void sort(String str)
    {
       char a[]=str.toCharArray();
 
       for(int i=0; i<a.length; i++)
        {
           for(int j=i+1; j<a.length; j++)
           {
               if(a[i]>a[j])
                {
                   char temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
         }

        String s=new String(a);
        System.out.println("\nAfter sorted order string is: "+s);
    }

     public static void main(String[] ar)
    { 
       String s="ducat";
       System.out.println("\nBefore sorted order string is: "+s);
       
       sort(s);
    }
}  