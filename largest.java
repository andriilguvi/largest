import java.io.*;
import java.util.*;
class largest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a<b)||(b>c)||(c<a))
{
System.out.print(b);
}
else
{
System.out.print("Nul");
}
}
}
