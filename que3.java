import java.util.Scanner;
class que3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int flag=0;
for(int i=2;i<=n;i++)
{
flag=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
flag=1;
}
if(flag==0)
{
System.out.println(i);}
}
}
}