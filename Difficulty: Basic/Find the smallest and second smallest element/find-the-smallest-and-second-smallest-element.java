//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Long.parseLong(inputLine[i]));
            }

            Solution obj = new Solution();
            int[] product = obj.minAnd2ndMin(arr);
            if (product[0] == -1)
                System.out.println(product[0]);
            else
                System.out.println(product[0] + " " + product[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] minAnd2ndMin(int arr[])
    {
        int ans[] = new int[2];
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        
        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
      if(hs.size() == 1)
      {
         ans[0] = -1;
      }
     
    
      else
      {
         ans[0] = list.get(0);
         ans[1] = list.get(1);
      }
      return ans;
    }
}
