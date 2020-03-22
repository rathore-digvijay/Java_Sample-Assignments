class sortarray
{
public static void main(String []args)
{
int a[]={7,5,6,9,9,9,9,5,36,4,44,3,85,3,65,1,1};
sorting a1;
    a1 = new sorting();
a1.sort(a);

}
}



class sorting
{
	void sort(int b[])
	
{
int temp=0;
for(int i=0;i<17;++i)
for(int j=i+1;j<17;++j)
{
if(b[i] > b[j])
 temp=b[i];
b[i]=b[j];
b[j]=temp;
 
 }
System.out.println("sorted array:");
for(int i=0;i<17;++i)
System.out.println(b[i]);


}

}