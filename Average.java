/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Average
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int sum=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		int avg=sum/n;
		System.out.println(avg);
	}
}
