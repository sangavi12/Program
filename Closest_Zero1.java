import java.util.*;
class Closest_Zero1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int i,temp=0,sum=0,val1=0,val2=0,j;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
temp=arr[i]+arr[j];
if(i==0 && j==1)
{
sum=temp;
val1=arr[i];
val2=arr[j];
}
else if(temp<sum && temp>=0)
{
sum=temp;
val1=arr[i];
val2=arr[j];
}
}
}
System.out.print(val1+" "+val2);
}
}
