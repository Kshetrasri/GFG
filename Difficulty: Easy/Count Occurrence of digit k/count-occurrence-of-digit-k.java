//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    public int num(int k, int arr[])
    {
        StringBuffer sb=new StringBuffer();
        sb.append(k);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        for(int i=1;i<sb.length();i++)
        {
            if(sb.charAt(i)==sb.charAt(0))
            count++;
        }
        return count;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.num(k, arr);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends