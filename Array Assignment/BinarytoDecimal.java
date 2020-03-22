class BinarytoDecimal
{
   static int getDecimal(int binary[])
   {
      int dec=0;
      int pow=0;
      
        for(int i=binary.length-1; i>=0; i--)
         {
               dec+=binary[i]*Math.pow(2,pow);
               pow++;
          }
           return dec;
     }
      
        public static void main(String... s) 
        {
            int Decimal=getDecimal(new int[]{1,1,1,1}); 
            System.out.println("Decimal Number:"+Decimal);
        }
}
  