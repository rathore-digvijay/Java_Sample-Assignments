class maxarray
{
public static void main(String []args)
{
int a[]={7,5,6,9,9,9,9,5,36,4,44,3,85,3,65,1,1};
operation a1=new operation();
int s=a1.maxarray(a);
System.out.println("largest is="+s);

}
}
class operation
{
int maxarray(int b[])
{
int max=b[0];
for(int x=0;x<17;x++)
{
if(max < b[x])
 max=b[x];
}

return max;

}

}