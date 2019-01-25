import java.util.*;
class Unique_Num
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int i,j,count=0;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
count=0;
for(j=0;j<n;j++)
{
if(arr[i]==arr[j])
{
count++;
}
}
if(count==1)
{
System.out.print(arr[i]);
break;
}
}
}
}

