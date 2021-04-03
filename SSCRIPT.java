import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		try{
            int t=sc.nextInt();    
            while(t--!=0)
		    {
		        int n=sc.nextInt();
		        int k=sc.nextInt();
		        String str=sc.nextLine();
		        if(sc.hasNextLine()) 
                {
                 str=sc.nextLine();
                }
                
                char[] ch = new char[str.length()+k];
                for (int i = 0; i < str.length(); i++) 
                {
                    ch[i] = str.charAt(i);
                }

                int count=0;
                int maxv=0;
                for (int i = 0; i < n; i++) 
                {   
                    if(ch[i] == '*')
                    {
                        count++;
                        if(count>=maxv)
                        {
                            maxv=count;
                        }
                    }
                    else
                    {
                        count=0;
                    }
                }
           
                if(maxv>=k)
                {
                   System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
           }
        }
        catch(java.lang.Throwable e)
        {
            System.out.println(e);
        }
		
	}
}
