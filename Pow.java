/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,b,f=0;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     while(a!=1){
         if(a%2!=0){
             f=1;
         }
         a=a/2;
        }
     if(f==1){
         System.out.println("no");
     }
 else{
         System.out.println("yes");
 }

	}
}
