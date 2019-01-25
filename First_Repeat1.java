import java.util.*;
class First_Repeat1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int arr1[]=new int[n];
int i,count=0,val=0,k=0,rep=0,m=0,count1=0,sec=0,j;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
rep=0;
count=0;
m=0;
if(i!=0)
{
for(j=0;j<n;j++)
{
if(arr1[j]==i)
{
rep=1;
break;
}
}
}
if(rep==0)
{
for(j=i+1;j<n;j++)
{
if(arr[i]!=arr[j])
{
    if(m==0)
    {
count++;
}
}
else
{
arr1[k]=j;
k++;
m=1;
}
}
if(m==1&&count>=0&&sec==0)
{
count1=count;
val=arr[i];
sec=1;
}
else if(m==1&&count<count1&&sec==1)
{
count1=count;
val=arr[i];
}
}
}
if(sec==1)
{
System.out.print(val);
}
else
{
    System.out.print("unique");
}
}
}


