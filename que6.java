import java.util.Scanner;
class que6
{
public static void main(String[] args)
{
int temp;
int a[]={1,1,1,1,0,0,1,0};
for(int i=0;i<8;i++)
{
for(int j=i+1;j<8;j++)
{
if(a[j]<a[i])
{
temp=a[j];
a[j]=a[i];
a[i]=temp;
}

}}
for(int i=0;i<8;i++)
{
System.out.print(a[i]);
}
}
}