/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n,a,c=0;
		n=sc.nextInt();
		while(n!=0)
		{ a=sc.nextInt();
			if(a%2==0) c++;
			n--;
		}
		if(c>n-c) System.out.print("READY FOR BATTLE");
		else System.out.print("NOT READY");
		
	}
}