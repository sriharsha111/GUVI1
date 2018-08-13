/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Special
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		/* package whatever; // don't place package name! */
		String str;
		int i,count=0,a=0,c=0,k=0;
		Scanner s=new Scanner(System.in);
		str=s.next();
		for(i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
		            {
		            	a++;
		            }
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				c++;
			}
			else if(str.charAt(i)=='_')
			{
				k++;
			}
			else
			{
			count++;
			}
		}
		System.out.println(count);
	}
}
