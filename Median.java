/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Median
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp;
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		int mid,med;
		if(n%2==0)
		{
			mid=n/2;
			med=(b[mid-1]+b[mid])/2;
		}
		else
		{
			mid=n/2;
			med=b[mid];
		}
		System.out.print(med);
	}
}
