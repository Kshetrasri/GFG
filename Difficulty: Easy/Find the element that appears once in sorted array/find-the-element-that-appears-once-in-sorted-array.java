//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int findOnce(int arr[], int n)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int  i=0;i<arr.length;i++)
        {
            int element = arr[i];
            int freq = hm.getOrDefault(element, 0);
            hm.put(element,freq+1);
        }
        int result= 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            if(entry.getValue() == 1)
            {
                result = entry.getKey();
            }
        }
        return result;
    }
}