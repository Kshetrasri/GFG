//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int temp[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int element = nums[i];
            int freq = hm.getOrDefault(element, 0); 
            hm.put(element, freq + 1);
        }
        
        int count=0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) 
        {
            if(entry.getValue() == 1)
            {
                temp[count] = entry.getKey();
                count++;
            }
        }
      Arrays.sort(temp);
        return temp;
    }
}