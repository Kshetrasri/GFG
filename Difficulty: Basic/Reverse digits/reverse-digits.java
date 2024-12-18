//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.reverseDigits(n);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
     public static int func(int n,int sum)
    {
    if(n == 0)
    {
        return sum;
    }
    int rim = n%10;
    sum = 10*sum+rim;
    n = n/10;
    return func(n,sum);
    }
    
    public int reverseDigits(int n) {
       
      int ans = func(n,0);
      return ans;
    
    }
}