//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    void segregateEvenOdd(int arr[])
    {
        Arrays.sort(arr);
        int count=0;
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                ans[count] = arr[i];
                count++;
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 != 0)
            {
                ans[count] = arr[i];
                count++;
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {
            //System.out.print(ans[i] + " ");
            arr[i] = ans[i];
        }
        
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
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
            obj.segregateEvenOdd(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends