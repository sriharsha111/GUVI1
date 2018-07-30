import java.util.*;
import java.lang.*;
import java.io.*;
class Intervalodd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
			while(++m<n)
			{
				if(m%2!=0)
				{
					System.out.print(m+" ");
				}
				
			}
		}
 
}
