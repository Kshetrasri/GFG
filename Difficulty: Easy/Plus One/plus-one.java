//{ Driver Code Starts
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
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N)
    {
        for(int i=arr.size()-1;i>=0;i--)
        {
            if(arr.get(i) < 9)
            {
               arr.set(i, arr.get(i) + 1);
                return arr;
            }
            else
            {
                 arr.set(i, 0);
            }
        }
        ArrayList<Integer> al  =new ArrayList<>();
        al.add(1);
        for(int i=0;i<arr.size();i++)
        {
            al.add(arr.get(i));
        }
        return al;
    }
};