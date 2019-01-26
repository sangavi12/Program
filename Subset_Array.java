import java.util.*;
class Subset_Array
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int a[]=new int[n];
int b[]=new int[m];
int i,j,count=0;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(j=0;j<m;j++)
{
b[j]=sc.nextInt();
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(b[i]==a[j])
{
count++;
break;
}
}
}
if(count==m)
{System.out.print("YES");
}
else
{
System.out.print("NO");
}
}
}
