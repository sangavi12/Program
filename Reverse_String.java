import java.util.*;
class Reverse_String
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String str1="";
String str2="";
int i;
for(i=0;i<=str.length();i++)
{
if(i==str.length() ||str.charAt(i)==' ')
{
StringBuffer ab=new StringBuffer(str1);
str2+=String.valueOf(ab.reverse())+" ";
str1="";
}
else
{
str1+=String.valueOf(str.charAt(i));
}
}
System.out.print(str2);
}
}
