/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Abstract
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int m1=s.nextInt();
		int m2=s.nextInt();
		int hr,min;
		hr=Math.abs(n1-m1);
		min=Math.abs(n2-m2);
		System.out.println(hr+" "+min);
	}
}
