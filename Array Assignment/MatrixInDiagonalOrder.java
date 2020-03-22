class MatrixInDiagonalOrder
{
    static int row=5,col=4;  
 
    static int min(int a, int b)
    { return(a>b)?a:b; }

    static int min(int a, int b, int c)
    { return min(min(a,b),c); }
 
    static int max(int a, int b)
    { return(a>b)?a:b; } 

    static void diagonalorder(int matrix[][])
    {
       for(int line=1; line<=(row+col-1); line++)
       {
          int start_col=max(0,((line)-(row)));
 
          int count=min(line,((col)-(start_col)),row);

          for(int j=0; j<count; j++)
           System.out.print(matrix[min(row,line)-j-1][start_col+j]+"\t");
       }
       System.out.println(" ");        
    }

    static void printMatrix(int matrix[][])
    {
       for(int i=0; i<row; i++)
        {
           for(int j=0; j<col; j++)
           {
             System.out.print(matrix[i][j]+"\t");        
           }   
           System.out.println(" ");        
        }
    }

    public static void main(String... s)
     {
        int M[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};

       System.out.println("Given Matrix is:\n");
       printMatrix(M);                         

       System.out.println("\nDiagonal printing of matrix is \n");
       diagonalorder(M);                         
     }
}