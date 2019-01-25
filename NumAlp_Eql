import java.util.*;
class NumAlp_Eql
{
    public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0,count1=0,len,j,k,f=0,div=0,i,new1,new2;
len=String.valueOf(n).length();
k=len;
int arr[]=new int[len];
j=len-1;
while(j>=0)
{
arr[j]=n%10;
if(arr[j]>=1 &&arr[j]<=26)
{
count1++;
}
n=n/10;
j--;
}
if(count1==len)
{
count++;
}
for(i=0;i<len-1;i++)
{
count1=0;
for(j=0;j<len-1;j++)
{
if(j==i)
{
    if(arr[j]==0)
    {
        new1=arr[j+1];
    }
    else
    {
    new1=Integer.parseInt(String.valueOf(arr[j])+String.valueOf(arr[j+1]));
    }
if(new1>=1 &&new1<=26)
{
count1++;
}
j+=1;
}
else if(arr[j]>=1 && arr[j]<=26)
{
count1++;
}
}
if(i!=len-2 && arr[len-1]>=1 &&arr[len-1]<=26)
{
count1++;
}
if(count1==len-1)
{
count++;
}
}
if(len>3)
{
    div=len/2;
if(len%2!=0)
{
len=len-1;
f=1;
div+=1;
}
count1=0;
for(i=0;i<len;i+=2)
{
    new2=Integer.parseInt(String.valueOf(arr[i])+String.valueOf(arr[i+1]));
if(new2>=1 && new2<=26)
{
count1++;
}
}
if(f==1)
{
if(arr[len-1]>=1 && arr[len-1]<=26)
{
count1++;
}
}
if(count1==div)
{
count++;
}
}
System.out.print(count);
}
}

