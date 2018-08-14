/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Compare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		if(a.length()>b.length())
		System.out.println(a);
		else if(a.length()<b.length())
		System.out.println(b);
		else
		{
			int ch1,ch2;
			for(int i=0;i<a.length();i++)
			{
				ch1=a.charAt(i);
				ch2=b.charAt(i);
				if(ch1==ch2)
				System.out.println(ch1);
				else if(ch1>ch2)
				{
				System.out.println(a);
				break;
				}
			
			else if(ch1<ch2)
			System.out.print(b);
			break;
			}
		}
	}
}
