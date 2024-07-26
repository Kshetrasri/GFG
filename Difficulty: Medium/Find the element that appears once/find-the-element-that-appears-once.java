//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            System.out.println(new Sol().search(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int element = arr[i];
            int freq = hm.getOrDefault(element,0);
            hm.put(element,freq+1);
        }
        int result=0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet())
        {
            if(entry.getValue() == 1)
            {
                result = entry.getKey();
               // System.out.println(result);
            }
        }
        return result;
    }
}