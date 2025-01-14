//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        long count=0;
        long sum=0;
        HashMap<Long,Long> hm = new HashMap<>();
           hm.put(0L, 1L);
        for(int i=0;i<arr.length;i++)
        {
             sum = sum+arr[i];
            if(hm.containsKey(sum))
            {
                count = count+hm.get(sum);
            }
           
           
                hm.put(sum,hm.getOrDefault(sum,0L)+1);
            
        }
        return count;
    }
}