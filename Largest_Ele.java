import java.util.*;
class Largest_Ele
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,k,i;
n=sc.nextInt();
k=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.print(arr[n-k]);
}
}
