
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Digits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
		}
		System.out.print(rev%10);
		rev=rev/10;
		while(rev!=0)
		{
			System.out.print(" "+rev%10);
			rev=rev/10;
		}
	}
}
