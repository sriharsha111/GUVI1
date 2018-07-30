import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class ultiple
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int c=1;c<=5;c++)
		{
			int a=n*c;
			System.out.println(a+" ");
		}
	}
}
