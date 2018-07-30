import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,j,count=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=2;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		}
			if(count==2)
			System.out.println("prime");
			else
			System.out.println("not");
 
	}
}
