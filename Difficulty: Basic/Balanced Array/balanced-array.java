//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        for (int k = 0; k < t; k++) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner lineScanner = new Scanner(input);
            while (lineScanner.hasNextInt()) {
                arr.add(lineScanner.nextInt());
            }
            lineScanner.close();

            Solution ob = new Solution();
            int ans = ob.minValueToBalance(arr);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr)
    {
        int ans=0;
        int first_sum=0;
        int last_sum=0;
        int mid = arr.size()/2;
      //System.out.println("mis value is " +mid );
      // System.out.println("arr size " +arr.size() );
        for(int i=0;i<mid;i++)
        {
            first_sum = first_sum + arr.get(i);
           // System.out.println("first sum is" +first_sum );
        }
        
         for(int i=mid;i<arr.size();i++)
        {
            last_sum = last_sum + arr.get(i);
        }
        
       // System.out.println("last sum is" +last_sum );
        if(first_sum>last_sum)
        {
            ans = first_sum -last_sum;
        }
        else
        {
            ans = last_sum - first_sum;
        }
        return ans;
    }
}