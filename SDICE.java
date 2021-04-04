import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t--!=0)
	    {
	        long n=sc.nextLong();
	        //long[] arrN = new long[]{0,1,6,12,24};
	        long d=n/4;
            long drem=n%4;
            long ans=0;
            if(n==1)
            {
                ans=20;
            }
            else if(n==2)
            {
                ans=36;
            }
            else if(n==3)
            {
                ans=51;
            }
            else if(n>=4)
            {
                if(drem==0)
                {
                    ans+=44*d;
                    ans+=4*4;
                }
                else if(drem==1)
                {
                    ans+=44*d;
                    ans+=3*4;
                    ans+=6+5+4+3+2;
                }
                else if(drem==2)
                {
                    ans+=44*d;
                    ans+=2*4;
                    ans+=2*(6+5+4+3);
                }
                else if(drem==3)
                {
                    ans+=44*d;
                    ans+=4;
                    ans+=2*(6+5+4+3)+6+5+4;
                }
            }
            System.out.println(ans);
       }
	}
}