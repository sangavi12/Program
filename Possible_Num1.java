import java.util.*;
class Possible_Num1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int i,j,num,k;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
num=arr[i]+arr[j];
for(k=j+1;k<n;k++)
{
if(arr[k]==num)
{
System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
break;
}
}
}
}
}
}
