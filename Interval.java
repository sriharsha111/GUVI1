import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Interval
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
			while(m<n)
			{
				if(m%2==0)
				{
					System.out.print(m+" ");
				}
				m++;
			}
		}
 
}
