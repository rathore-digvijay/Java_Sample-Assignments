
class Rightrim
{
   static String Rtrim(String str)
   {
        String str1=ReverseStr2.reverse(str);
        String str2=Leftrim.Ltrim(str1);
        String str3=ReverseStr2.reverse(str2);

        return(str3);

   }
   
    public static void main(String[] ar)
    {
        String s="   Welcome to India   ";
        System.out.println("\n\nBefore right trim String is: "+s);
        System.out.println("Length of String is: "+s.length());

        String str=Rtrim(s);
        System.out.println("\n\nAfter right trim String is: "+str);
        System.out.println("Length of String is: "+str.length());
     }
}