import java.util.Scanner;
class que5
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int rev=0,b=0;
while(n>0)
{
b=n%10;
rev=b+rev*10;
n=n/10;
}
System.out.println("Reverse of a number is:"+rev);
}
}
