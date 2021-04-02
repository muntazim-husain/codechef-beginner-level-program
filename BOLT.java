/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
		    float k1 = sc.nextFloat();
		    float k2 = sc.nextFloat();
		    float k3 = sc.nextFloat();
		    float v = sc.nextFloat();
		    float mul = k1*k2*k3*v;
		    float dev= 100/mul;
		    float dev1=dev*1000;
		    float last=dev1%10;
		    float Fdev;
		    float finalvalue=0;
		    float last1;
		    if(last>5)
		    {   
		        last1=10-last;
		        Fdev=dev1+last1;
		        finalvalue=Fdev/1000;
		    }
		    else
		    {
		        Fdev=dev1-last;
		        finalvalue=Fdev/1000;
		        
		    }
		    float finalvalue1=finalvalue*100;
		    if(finalvalue1>=958)
		    {
		        System.out.println("NO");
		    }
		    else
		    {
		        System.out.println("YES");
		    }
		}
	}
}
