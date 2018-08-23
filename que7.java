import java.util.Scanner;
class que7
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[]{1,4,6,7,8,9,10};
int flag=0;
for(int i=0;i<7;i++)
{
if(n==arr[i])
{
flag=1;
}
}
if(flag==1)
{
System.out.println(n + " No. Exists");
}
else
{
System.out.println(n + " No. Not Exists");
}
}
} 