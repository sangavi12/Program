import java.util.*;
class Star_Num
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int i,temp=0,val=0;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(i==0)
{
temp=arr[i];
}
else if(arr[i]>temp)
{
temp=arr[i];
}
}
for(int j=0;j<n;j++)
{
val=0;
for(i=j+1;i<n;i++)
{
if(arr[j]<arr[i])
{
val=1;
break;
}
}
if(val==0)
{
System.out.print(arr[j]+" ");
}
}
System.out.println();
System.out.print(temp);
}
}

