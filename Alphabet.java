import java.util.*;
import java.util.Scanner;
public class Alphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.next().charAt(0);
if((n>='a'&&n<='z')||(n>='A'&&n<='z'))
{
System.out.println("Alphabet");
}
else
System.out.println("No");
}
}
