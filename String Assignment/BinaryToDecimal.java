//public int BinarytoDecimal(String s)

class BinaryToDecimal
{
    int getDecimal(String str)
   {
      int dec=0;
      int pow=0;
      int num=0;
        
        char binary[]=str.toCharArray();
     
        for(int i=binary.length-1; i>=0; i--)
         {
                num=binary[i]-48;// if we can use direct without subtract 48 in char but char drive from string so, we have to subtract 48  
       
               if(num!=0 && num!=1)
                  return -1;// Invalid String
             
               dec+=num*Math.pow(2,pow);
               pow++;
          }
           return dec;
        }
      
        public static void main(String... s) 
        {
            BinaryToDecimal b2d=new BinaryToDecimal();
         
            int Decimal=b2d.getDecimal("1010"); 
             
            if(Decimal==-1)
            System.out.println("\nInvalid String");
            else
            System.out.println("\nDecimal Number: "+Decimal);
        }
}
  