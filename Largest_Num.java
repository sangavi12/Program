import java.util.*;
class Largest_Num
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int i,count=0;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(arr[i]==0)
{
count++;
}
}
if(count==n)
{
System.out.print(count-n);
}
else
{
Arrays.sort(arr);
for(i=n-1;i>=0;i--)
{
System.out.print(arr[i]);
}
}
}
}
