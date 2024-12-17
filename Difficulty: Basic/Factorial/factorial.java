//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.factorial(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution
{
    //static int value=0;
    static int func(int N,int ans)
    {
        if(N==0)
        {
            return ans;
        }
       
            ans = ans*N;
            N--;
          return  func(N,ans);
    }
    static long factorial(int N)
    {
       
        int ans1 = func(N,1);
        return ans1;
    }
}