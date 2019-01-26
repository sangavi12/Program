import java.util.*;
class EvenOdd_Num
{
public static  void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int i;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(i%2==0 && arr[i]%2!=0)
{
System.out.print(arr[i]+" ");
}
else if(i%2!=0 && arr[i]%2==0)
{
System.out.print(arr[i]+" ");
}
}
}
}
