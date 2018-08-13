/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Lines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count=0;
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ')
			{
				count++;
			}
		}
			count=count+1;
			System.out.println(count);
		
		
	}
}
