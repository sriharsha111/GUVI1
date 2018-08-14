/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Maximum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int max;
		Scanner s=new Scanner(System.in);
		int a[]=new int[8];
		for(int i=0;i<8;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<8;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}

		
