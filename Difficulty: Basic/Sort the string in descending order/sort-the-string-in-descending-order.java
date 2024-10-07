//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.ReverseSort(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String ReverseSort(String str) 
    { 
       char ch[] = str.toCharArray();
       Arrays.sort(ch);
       
        StringBuilder result = new StringBuilder();
        
        // Append characters in reverse order to result
        for (int i = ch.length - 1; i >= 0; i--)
        {
            result.append(ch[i]);
        }
        
        // Convert StringBuilder back to String
        return result.toString();
    }
} 