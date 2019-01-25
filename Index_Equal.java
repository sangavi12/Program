import java.util.*;
class Index_Equal
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int i,count=0,k=0;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(arr[i]==i)
{
count++;
}
}
if(count>=1)
{
int arr1[]=new int[count];
for(i=0;i<n;i++)
{
if(arr[i]==i)
{
arr1[k]=i;
k++;
}
}
Arrays.sort(arr1);
for(i=0;i<count;i++)
{
System.out.print(arr1[i]+" ");
}
}
else
{
System.out.print(count-1);
}
}
}

