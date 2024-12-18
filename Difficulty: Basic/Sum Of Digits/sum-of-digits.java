//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfDigits(N));

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
    sum = sum+rim;
    n = n/10;
    return func(n,sum);
    }
    static int sumOfDigits(int n)
    {
      int ans = func(n,0);
      return ans;
    }
}
