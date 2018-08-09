import java.util.*;
import java.util.Scanner;
public class ReverseNumber
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in)
char[] a=s.nextLine().toCharArray();
for(int i=a.length-1;i>=0;i--)
{
System.out.print(a[i]);
}
System.out.print("\n");
}
}
