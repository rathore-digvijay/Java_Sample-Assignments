class PrintTriangleWise
{
     public static void main(String[] ar)
     { 
        final int m=10;
        
        int[][] odds=new int[m+1][];
        for(int i=0;i<=m;i++)
        odds[i]=new int [i+1];

           for(int i=0;i<odds.length;i++){
         for(int j=0;j<odds[i].length;j++){ odds[i][j]=i+j;}
         }

        for(int i=0;i<odds.length;i++){
         for(int j=0;j<odds[i].length;j++){ System.out.print(odds[i][j]+" ");}
          System.out.println();   }
      
      }
} 