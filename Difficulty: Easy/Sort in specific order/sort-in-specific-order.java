//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the test cases
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the Long integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into Long integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            // Convert ArrayList to array
            Long[] arr = new Long[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();
            ob.sortIt(arr);

            StringBuilder output = new StringBuilder();
            for (Long value : arr) {
                output.append(value).append(" ");
            }
            System.out.println(output.toString().trim());
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public void sortIt(Long arr[])
    {
       ArrayList<Long> even = new ArrayList<>();
       ArrayList<Long> odd = new ArrayList<>();
       
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 ==0)
            {
                even.add(arr[i]);
            }
            else
            {
                odd.add(arr[i]);
            }
        }
        Collections.sort(odd);
        Collections.reverse(odd);
        
        Collections.sort(even);
        
        Long a[] = new Long[arr.length];
        
        int count=0;
        for(int i=0;i<odd.size();i++)
        {
            a[count] = odd.get(i);
            count++;
        }
         for(int i=0;i<even.size();i++)
        {
            a[count] = even.get(i);
            count++;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = a[i];
        }
       
    }
}