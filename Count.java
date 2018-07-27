import java.util.*;
import java.util.Scanner;
public class Count
{
public static void main(String args[])
{
int count=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n>0)
{
n=n/10;
count++;
}
System.out.println(count);
}
}
