/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Isomarphic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int k=0,m=0,n;
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		n=a.length();
		for(int i=1;i<n;i++)
		for(int j=i+1;j<n;j++)
		{
			if(a.charAt(i)==a.charAt(j))
			{
				k=i;
				m=j;
			}
		}
			if(b.charAt(k)==b.charAt(m))
			{
				System.out.println("yes");
			}
			else
			System.out.println("no");
	}
}
