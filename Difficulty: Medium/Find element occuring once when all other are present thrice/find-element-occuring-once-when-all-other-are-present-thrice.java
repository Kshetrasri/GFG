//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.singleElement(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int singleElement(int[] arr , int N) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            int element = arr[i];
            int freq = hm.getOrDefault(element, 0); 
            hm.put(element, freq + 1);
        }
        int result =0;
       
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) 
        {
            if(entry.getValue() == 1)
            {
                 result = entry.getKey();
               
            }
        }
     
        return result;
        // code here
    }
}