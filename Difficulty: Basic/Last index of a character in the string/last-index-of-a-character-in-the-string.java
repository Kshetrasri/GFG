//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();
            char c = read.readLine().trim().charAt(0);
            Solution ob = new Solution();
            System.out.println(ob.LastIndex(s, c));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int LastIndex(String s, char p)
    {
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            if(ch == p)
            {
               return i;
            }
            
        }

       return -1;
    }
}
