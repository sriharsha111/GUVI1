/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fibonaci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int first=1,second=1,next;
		if(n==1)
		System.out.print(first);
		else if(n==2)
		System.out.print(first+" "+second);
		else
		{
			System.out.print(first+" "+second);
		for(int i=2;i<n;i++)
		{
			next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
		}
		}
	}
}
