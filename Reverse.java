import java.util.*;
import java.util.Scanner;
public class Reverse
{
public static void main(String args[])
{
int reverse=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{
reverse=reverse*10;
reverse=reverse+n%10;
n=n/10;
}
Ststem.out.print(reverse);
}
}
