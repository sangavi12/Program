import java.util.*;
class First_Repeat
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int count=0,k=0,i,j;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n&&k==0;i++)
{
count=0;
for(j=0;j<n;j++)
{
if(arr[i]==arr[j])
{
count++;
}
}
if(count>1)
{
System.out.print(arr[i]);
k=1;
}
}
if(k==0)
{
System.out.print("unique");
}
}
}
