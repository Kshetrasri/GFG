//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) 
    {
        HashMap<Long,Long> hm = new HashMap<>();
        for(int i=0;i<a1.length;i++)
        {
          
            long element = a1[i];
            long freq = hm.getOrDefault(element, 0L) + 1;
            hm.put(element, freq);
        }
        int count=0;
        for(int i=0;i<a2.length;i++)
        {
            long element = a2[i];
            if(hm.containsKey(element))
            {
                if(hm.get(element) >0)
                {
                    long value = hm.get(element);
                    value = value-1;
                    hm.put(element,value);
                }
                else
                {
                    return "No";
                }
            }
            else
            {
                return "No";
            }
        }
       
        return "Yes";
        
    }
}