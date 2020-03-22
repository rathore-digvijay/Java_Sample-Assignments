
package arayex;


public class ArayEx {

    public static void main(String[] args) {
        int a[]=new int[]{7,5,1,4,32,96,5,5,6};
        //int a[]={7,5,1,4,32,96,5,5,6};
        Arrayop a1=new Arrayop();
        int r=a1.addArrayEle(a);
        System.out.println("sum ="+r);
    }
    
}

class Arrayop
{
    int addArrayEle(int b[])
    {
        int s=0;
        for(int x=0;x<9;x++)
          s=s+b[x];
        return s;
        
    }
}
