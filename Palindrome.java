 
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int r,sum=0,temp;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("yes");
		}
		else
		System.out.println("no");
	}
}
