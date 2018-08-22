import java.util.Scanner;
class que4
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m,b,sum=0;
m=n;
while(m!=0)
{
b=m%10;
sum=sum+b*b*b;
m=m/10;
}
if(sum==n)
{
System.out.println(n + " is an Armstrong Number");
}
else
{
System.out.println(n + " is not an Armstrong Number");
}
}
}
