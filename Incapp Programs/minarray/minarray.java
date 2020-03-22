class minarray
{
public static void main(String []args)
{
int a[]={7,5,6,9,9,9,9,5,36,4,44,3,85,3,65,1,1};
operation a1=new operation();
int s=a1.minarray(a);
System.out.println("smallest is="+s);

}
}
class operation
{
int minarray(int b[])
{
int min=b[0];
for(int x=0;x<17;x++)
{
if(min > b[x])
 min=b[x];
}

return min;

}

}