import java.util.*;
import java.util.Scanner;
public class Amstrong
{
public static void main(String args[])
{
int r,temp,sum=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n>0)
{
r=n%10;
sum=sum+r*r*r;
n=n/10;
}
if(temp==sum)
{
System.out.println("yes");
}
else
System.out.prinln("no");
}
}
