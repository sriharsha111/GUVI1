/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Char1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String n=s.next();
		for(char c:n.toCharArray())
		{
			if(Character.isDigit(c))
			{
				System.out.println("yes");
				break;
			}
			else
			{
				System.out.println("No");
				break;
			}
		}
	}
}
