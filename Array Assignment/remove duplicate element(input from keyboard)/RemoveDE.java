import java.util.Scanner;

class RemoveDE
{
    public static void main(String[] ar)
    {
       int arr[]=new int[6];

       System.out.println("Enter an Array:");

       Scanner s=new Scanner(System.in);

       for(int i=0;i<arr.length; i++)
       {
          arr[i]=s.nextInt();
       } 

       DuplicateRemove(arr);
    }

    static void DuplicateRemove(int arr[])
    {
        int unique=arr.length;

        for(int i=0; i<unique; i++)
        {
           for(int j=i+1; j<unique; j++)
           {
              if(arr[i]==arr[j])
              {
                 arr[j]=arr[unique-1];
                 unique--;
                 j--;
              }
           }
        }

        System.out.println("Unique element of Array:"+unique);
                for(int i=0; i<unique; i++)
                {
                    System.out.println(arr[i]);
                }                   
    }
       
}