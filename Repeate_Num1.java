import java.util.*;
class Repeate_Num1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]=new int[num];
int i,k=0,j,count=0;
for(i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
for(i=0;i<num;i+=k)
{
k=0;
for(j=i;j<num;j++)
{
if(arr[i]==arr[j])
{
k++;
}
else
{
break;
}
}
if(k>1)
{
System.out.print(arr[i]+" ");
count=1;
}
}
if(count==0)
{
System.out.print("unique");
}
}
}
