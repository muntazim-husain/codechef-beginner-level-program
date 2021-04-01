import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long t, i, n;
		int count;
		Scanner sc = new Scanner(System.in);
		t=sc.nextLong();
		for(i=0; i <t; i++){
		    n = sc.nextLong();
		    count = 0;
		    while(n > 0){
		        int rem = (int) n%10;
		        if(rem == 4)
		            count++;
		        n = n/10;      
		    }
		    System.out.println(count);
		}
	}
}
