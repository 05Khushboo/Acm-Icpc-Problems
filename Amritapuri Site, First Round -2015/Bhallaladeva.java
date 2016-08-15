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
		int n,q;
		n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		} Arrays.sort(a);
		for(int i=1;i<n;i++)
		{
			a[i]+=a[i-1];
		//System.out.print(a[i]+" ");
		}
	q=sc.nextInt();
		while(q!=0)
		{ q--;
		int k;
		k=sc.nextInt();
		int p=n/(k+1);
		if(n%(k+1)!=0) p+=1;
		p-=1;
		
		 System.out.println(a[p]);
			
		}
	}
} 